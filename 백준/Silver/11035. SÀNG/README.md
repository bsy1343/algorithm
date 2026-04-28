# [Silver III] SÀNG - 11035

[문제 링크](https://www.acmicpc.net/problem/11035)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 211, 정답: 149, 맞힌 사람: 94, 정답 비율: 63.946%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>S&agrave;ng của Eratosthenes l&agrave; thuật to&aacute;n nổi tiếng để t&igrave;m tất cả c&aacute;c số nguy&ecirc;n tố nhỏ hơn N. Thuật to&aacute;n như sau:&nbsp;</p>

<ol>
	<li>Ghi ra tất cả c&aacute;c số nguy&ecirc;n giữa 2 v&agrave; N.&nbsp;</li>
	<li>T&igrave;m số nhỏ nhất chưa bị gạch v&agrave; gọi n&oacute; l&agrave; P (P l&agrave; số nguy&ecirc;n tố).&nbsp;</li>
	<li>Gạch bỏ P v&agrave; tất cả c&aacute;c bội số của n&oacute; m&agrave; chưa bị gạch.&nbsp;</li>
	<li>Nếu c&ograve;n số chưa bị gạch bỏ, chuyển sang bước 2.&nbsp;</li>
</ol>

<p>Viết một chương tr&igrave;nh, cho N v&agrave; K, t&igrave;m số nguy&ecirc;n thứ K bị gạch.</p>

### 입력

<p>Gồm nhiều bộ test, mỗi bộ test nằm tr&ecirc;n một d&ograve;ng gồm c&aacute;c số nguy&ecirc;n N v&agrave; K (2 &le; K &lt; N &le; 1000).&nbsp;</p>

### 출력

<p>Với mỗi test, in ra tr&ecirc;n một d&ograve;ng số thứ K bị gạch bỏ.</p>