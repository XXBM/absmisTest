package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.RealEstateEn;
import com.absmis.service.enterprise.RealEstateEnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuling on 2016/10/11.
 */

@RestController
public class RealEstateEnController {
    @Autowired
    RealEstateEnService realEstateEnService;

    //添加
    @RequestMapping(value = "/addRealEstateEn", method = RequestMethod.POST)
    public Map<String, Object> addRealEstateEn(@RequestBody RealEstateEn realEstate)throws Exception {
        this.realEstateEnService.addRealEstateEn(realEstate);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("realEstate", realEstate);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllRealEstateEns", method = RequestMethod.GET)
    public List<RealEstateEn> findRealEstateEn()throws Exception {
        List<RealEstateEn> realEstates = realEstateEnService.findAllT();
        return realEstates;
    }


    //实现分页
    @RequestMapping(value = "/displayAllRealEstateEns", method = RequestMethod.GET)
    public Map<String, Object> findAllRealEstateEn(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<RealEstateEn> list = this.realEstateEnService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.realEstateEnService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改    完成 改
    @RequestMapping(value = "/updateRealEstateEn", method = RequestMethod.PUT)
    public Map<String, Object> updateRealEstateEn(@RequestBody RealEstateEn realEstate)throws Exception {
        this.realEstateEnService.updateRealEstateEn(realEstate);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("realEstate", realEstate);
        return map;
    }

    //删除   完成 删
    @RequestMapping(value = "/deleteRealEstateEn", method = RequestMethod.DELETE)
    public void deleteRealEstateEn(@RequestParam("id") Long id)throws Exception {
        this.realEstateEnService.deleteRealEstateEn(id);
    }

    //批量删除   完成 删
    @RequestMapping(value = "/deleteRealEstateEns",method = RequestMethod.DELETE)
    public void deleteRealEstateEns(@RequestParam("ids") String ids){
        String deleteIds[] = ids.split(",");
        for(int i = 0; i<deleteIds.length; i++){
            this.realEstateEnService.deleteById(Long.parseLong(deleteIds[i]));
        }
    }
}
