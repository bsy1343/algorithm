# [Platinum III] JANJE - 10741

[문제 링크](https://www.acmicpc.net/problem/10741)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 33, 정답: 7, 맞힌 사람: 7, 정답 비율: 24.138%

### 분류

수학, 조합론

### 문제 설명

<p>Young Bojan, today a successful student of electrical engineering, loved coloring ever since he was a little boy. Remembering careless days from his childhood, he decided to buy a coloring book and K colors and get to work. It&rsquo;s interesting that Bojan doesn&rsquo;t like colorful pictures, so he decided to color each picture using at most three different colors. Additionally, Bojan will never color two adjacent areas using the same color because, as he puts it, &quot;what&rsquo;s the use of this line in between then?&quot; Two areas are considered adjacent if their edges have at least one joint point. For example, areas denoted with 4 and 3 (see image below) are adjacent, whereas areas 1 and 2 aren&rsquo;t. Additionally, coloring of the image below is in accordance with all of Bojan&rsquo;s demands.</p>

<p style="text-align:center"><img alt="" src="/upload/images3/janje.png" style="height:198px; width:214px" /></p>

<p>Before he begins coloring a picture, Bojan asks himself in how many ways he can color that picture so he meets with all his conditions. Given the fact that Bojan is studying electrical engineering, it is understandable that combinatorics isn&rsquo;t his strong point, so he asked you for help.</p>

### 입력

<p>The first and only line of input contains two integers N (1 &le; N &le; 8) and K (1 &le; K &le; 1 000) which denote the ordinal number of the picture from the coloring book and the number of different colors Bojan can use, respectively.</p>

<p>You can find the coloring book with the numbered pictures on the next page.</p>

### 출력

<p>The first and only line of output must contain the number of ways Bojan can color the Nth picture from the coloring book if he has K different colors at his disposal. Two colorings are different if they differ in color in at least one area.</p>

### 힌트

<h2 style="text-align: center;">HAPPY COLORING BOOK</h2>

<p style="text-align: center;"><img alt="" src="/upload/images3/color1.png" style="height:276px; width:432px" /></p>

<p style="text-align: center;">Picture 1. Caterpillar (the eyes and the antennas are not areas and should not be colored)</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/color2.png" style="height:340px; width:231px" /></p>

<p style="text-align: center;">Picture 2. A sea cottage</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/color3.png" style="height:242px; width:240px" /></p>

<p style="text-align: center;">Picture 3. A well known logo</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/color4.png" style="height:276px; width:120px" /></p>

<p style="text-align: center;">Picture 4. Frosty the Snowman&nbsp;</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/color5.png" style="height:228px; width:237px" /></p>

<p style="text-align: center;">Picture 5. An abstract ball</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/color6.png" style="height:384px; width:376px" /></p>

<p style="text-align: center;">Picture 6. Pyramid&nbsp;</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/color7.png" style="height:415px; width:190px" /></p>

<p style="text-align: center;">Picture 7. Daisy</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/color8.png" style="height:371px; width:371px" /></p>

<p style="text-align: center;">Picture 8. Trampoline (the gray part is not considered an area and should not be colored)</p>