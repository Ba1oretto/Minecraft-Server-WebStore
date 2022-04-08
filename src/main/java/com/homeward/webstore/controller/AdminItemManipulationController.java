package com.homeward.webstore.controller;

import com.homeward.webstore.aop.annotations.JoinPointSymbol;
import com.homeward.webstore.java.bean.BO.FileImageBO;
import com.homeward.webstore.java.bean.PO.ItemWholeInfo;
import com.homeward.webstore.java.bean.VO.R;
import com.homeward.webstore.service.AdminItemManipulationService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/admin")
public class AdminItemManipulationController {
    private final AdminItemManipulationService adminItemManipulationService;

    public AdminItemManipulationController(AdminItemManipulationService adminItemManipulationService) {
        this.adminItemManipulationService = adminItemManipulationService;
    }

    @PostMapping("/insert")
    @JoinPointSymbol
    public R insertItem(@RequestBody ItemWholeInfo information) {
        adminItemManipulationService.insertItem(information);
        return R.ok();
    }

    @PostMapping("/update")
    @JoinPointSymbol
    public R updateItem(@RequestBody ItemWholeInfo information) {
        adminItemManipulationService.updateItem(information);
        return R.ok();
    }

    @PostMapping("/file/upload")
    @JoinPointSymbol
    public R uploadImage(MultipartFile file, @RequestParam String category, @RequestParam String name) {
        FileImageBO fileImageBO = adminItemManipulationService.uploadImage(file, category, name);
        return R.ok(fileImageBO);
    }

    @PostMapping("/file/unmount")
    @JoinPointSymbol
    public R unmountImage(String category, String name) {
        adminItemManipulationService.unmountImage(category, name);
        return R.ok();
    }
}
