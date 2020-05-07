update furama.DichVuDiKem join
    (select TenDIchVuDiKem,Sum(SoLuong)
     from furama.DichVuDiKem join furama.HopDongChiTiet HDCT on DichVuDiKem.IDDichVuDiKem = HDCT.IDDichVuDiKem
                      join furama.HopDong HD on HDCT.IDHopDong = HD.IDHopDong
     where year(NgayLamHopDong) = 2019
     group by HDCT.IDDichVuDiKem
     having sum(SoLuong)>10
    ) as temp on temp.TenDIchVuDiKem = DichVuDiKem.TenDIchVuDiKem
set Gia = Gia*2 where temp.TenDIchVuDiKem = DichVuDiKem.TenDIchVuDiKem;