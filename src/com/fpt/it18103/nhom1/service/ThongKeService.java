/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.ThongKe;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ThongKeService {

    List<ThongKe> getAll();

    List<ThongKe> sortNgayTao();

    List<ThongKe> searchThoiGian(String tuNgay, String denNgay);
}
