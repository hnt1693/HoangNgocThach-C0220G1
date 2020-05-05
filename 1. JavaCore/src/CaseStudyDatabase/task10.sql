select HopDong.IDHopDong,
       NgayLamHopDong,
       NgayKetThuc,
       TienDatCoc,
       sum(SoLuong) as SoLuongDVDiKem
from furama.HopDong
         join furama.HopDongChiTiet HDCT on HopDong.IDHopDong = HDCT.IDHopDong
group by HDCT.IDHopDong