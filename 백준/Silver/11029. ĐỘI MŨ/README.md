# [Silver III] ĐỘI MŨ - 11029

[문제 링크](https://www.acmicpc.net/problem/11029)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 48, 정답: 28, 맞힌 사람: 18, 정답 비율: 52.941%

### 분류

애드 혹, 수학

### 문제 설명

<p>Từ xưa đến nay, việc ph&acirc;n chia học sinh v&agrave;o từng khoa của trường Hogwart được thực hiện bởi những chiếc mũ ph&eacute;p thuật. Trước kia, trường c&oacute; 4 khoa. Tuy nhi&ecirc;n, sau khi t&aacute;i cơ cấu lại trường, số khoa thay đổi th&agrave;nh p. Những chiếc mũ vẫn được sử dụng để ph&acirc;n chia học sinh.&nbsp;</p>

<p>Kế hoạch ph&acirc;n chia học sinh v&agrave;o từng khoa được biểu diễn bằng d&atilde;y số a[1], a[2],..., a[k], trong đ&oacute; a[i] l&agrave; khoa m&agrave; học sinh i sẽ học.&nbsp;</p>

<p>C&aacute;ch ph&acirc;n chia học sinh của chiếc mũ được m&ocirc; tả như sau: C&aacute;c khoa trong trường được đ&aacute;nh số từ 0 đến p &ndash; 1. Gọi next(x) l&agrave; khoa kế tiếp của khoa x với next(x) = x+1 với x &lt; p -1 v&agrave; next(p-1) = 0. Kế hoạch ph&acirc;n chia được bắt đầu bằng một d&atilde;y số c&oacute; duy nhất 1 phần tử 0. Sau mỗi bước, d&atilde;y a với k phần tử sẽ trở th&agrave;nh d&atilde;y số mới c&oacute; 2k phần từ a[1], a[2],..., a[k], next(a[1]), next(a[2]),..., next(a[k]).&nbsp;</p>

<p>X&eacute;t v&iacute; dụ về việc ph&acirc;n chia 9 học sinh v&agrave;o 4 khoa. Chiếc mũ sẽ thực hiện theo kế hoạch: (0), (0, 1), (0, 1, 1, 2), (0, 1, 1, 2, 1, 2, 2, 3), (0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 0),... Độ d&agrave;i của d&atilde;y cuối đủ cho 9 học sinh.&nbsp;</p>

<p>Cho c&aacute;c cặp số p, n. Nhiệm vụ của bạn l&agrave; cho biết khoa n&agrave;o trong số p khoa của trường m&agrave; học sinh thứ n sẽ v&agrave;o học ở đ&oacute; (học sinh được đ&aacute;nh số từ 1)</p>

### 입력

<p>D&ograve;ng đầu l&agrave; số truy vấn Q (1 &le; Q &le; 310000). Q d&ograve;ng tiếp, mỗi d&ograve;ng l&agrave; một cặp số p, n (1 &le; n &le; 10<sup>18</sup>, 2 &le; p &le; 10<sup>18</sup>)</p>

### 출력

<p>In ra Q d&ograve;ng lần lượt l&agrave; đ&aacute;p &aacute;n của Q truy vấn</p>