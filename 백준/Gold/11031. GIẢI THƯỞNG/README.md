# [Gold IV] GIẢI THƯỞNG - 11031

[문제 링크](https://www.acmicpc.net/problem/11031)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 194, 정답: 64, 맞힌 사람: 49, 정답 비율: 30.435%

### 분류

다이나믹 프로그래밍, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Một trường C&ocirc;ng Nghệ trao tiền thưởng cho học sinh đi học đầy đủ v&agrave; đ&uacute;ng giờ. Nếu vắng mặt trong ba ng&agrave;y li&ecirc;n tiếp hoặc đi muộn nhiều hơn một lần th&igrave; sinh vi&ecirc;n sẽ bị tịch thu tiền thưởng.&nbsp;</p>

<p>Trong suốt khoảng thời gian N ng&agrave;y, &ldquo;bản điểm danh&rdquo; của một học sinh l&agrave; một chuỗi N k&yacute; tự L (muộn), O (đ&uacute;ng giờ), v&agrave; A (vắng mặt).&nbsp;</p>

<p>Mặc d&ugrave; c&oacute; 81 chuỗi trong suốt 4 ng&agrave;y c&oacute; thể được tạo ra, ch&iacute;nh x&aacute;c 43 chuỗi sẽ dẫn đến giải thưởng:&nbsp;</p>

<pre>
OOOO OOOA OOOL OOAO OOAA OOAL OOLO OOLA OAOO OAOA OAOL OAAO OAAL OALO OALA OLOO OLOA&nbsp;
OLAO OLAA AOOO AOOA AOOL AOAO AOAA AOAL AOLO AOLA AAOO AAOA AAOL AALO AALA ALOO ALOA ALAO&nbsp;
ALAA LOOO LOOA LOAO LOAA ƯLAOO LAOA LAAO&nbsp;</pre>

<p>Hỏi c&oacute; bao nhi&ecirc;u chuỗi &quot;giải thưởng&quot; tồn tại sau một khoảng thời gian N ng&agrave;y?</p>

### 입력

<p>Gồm nhiều test, mỗi test nằm tr&ecirc;n một d&ograve;ng gồm 1 số nguy&ecirc;n N &le; 3000</p>

### 출력

<p>Với mỗi test, in ra tr&ecirc;n một d&ograve;ng kết quả phải t&iacute;nh</p>