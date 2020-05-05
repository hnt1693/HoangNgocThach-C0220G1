select *, ROUND(DATEDIFF(CURDATE(), NgaySinh) / 365, 0) as Years
from furama.KhachHang
where (ROUND(DATEDIFF(CURDATE(), NgaySinh) / 365, 0) between 18 and 50 )
  and (DiaChi = 'Đà Nẵng' or DiaChi = 'Quảng Trị');
