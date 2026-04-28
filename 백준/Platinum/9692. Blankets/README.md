# [Platinum I] Blankets - 9692

[문제 링크](https://www.acmicpc.net/problem/9692)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 10, 맞힌 사람: 8, 정답 비율: 20.000%

### 분류

자료 구조, 구현, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>This summer, Byteburg citizens are turning out in droves at the city beach down by the Byteotian Lake to experience the joy of sunbathing. Every Byteburg citizen arrives at the beach equipped with the blanket manufactured by&nbsp;<i>Byteasar &amp; Son</i>, the trendiest this season. All blankets are of equal size <em>a</em>&nbsp;&times; <em>b</em>&nbsp;(although different patterns), and each sunbather sets out his blanket in such a way that her blanket longer side is always perpendicular to the lake.</p>

<p>One of this year&#39;s sunbathers is professor Byteoni. After a few days of sunbathing professor noticed, that all the people who come to the beach always set out their blankets in their own favourite individual places, always the same. Although people come to the beach and leave it at different times, the professor never heard that any sunbather had taken over somebody&#39;s else&#39;s favourite place by putting the blanket there. This observation made the professor so curious, he decided to study this phenomenon.</p>

<p>For that purpose he set a coordinate system on the beach, and for every of the <em>n</em>&nbsp;Byteburgians noted down the coordinates of each of the spots where individual citizens always put their blankets. The system is devised in such a way that the OX-axis is parallel to <em>a</em>&nbsp;sides, and the OY-axis to <em>b</em>&nbsp;sides of all of the blankets. The professor initially wanted to calculate the area of intersection of the areas occupied by the blankets for each pair of them. But then he realized that it is enough for further research that he has only the average of these values. In other words, he is interested in the expected value of the area of intersection of the fields occupied by blankets belonging to two different random people of Byteburg. Using the data provided by the professor, help him do the calculation.</p>

### 입력

<p>The first line of input contains three integers <em>n</em>, <em>a</em>&nbsp;and <em>b</em>&nbsp;(2 &le; <em>n</em> &le; 200 000, 1 &le; <em>a</em>, <em>b</em> &le; 1 000 000) indicating respectively the number of Byteburg inhabitants and the sizes of the blankets. Each of the subsequent <em>n</em>&nbsp;lines contains two integers <em>x<sub>i</sub></em>&nbsp;and&nbsp;<em>y<sub>i</sub></em>&nbsp;(0 &le; <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em> &le; 1 000 000) indicating the coordinates of the point where <em>i</em>-th Byteburg citizen always puts the lower left corner of his blanket.</p>

### 출력

<p>Your program should print one real number that represents the average area of intersection of the areas occupied by the blankets belonging to pairs of Byteburg inhabitants. Your result will be deemed valid if it is in the following range [<em>x</em>-<em>e</em>, <em>x</em>+<em>e</em>], where&nbsp;<em>x</em>&nbsp;is the correct answer, and e = 10<sup>-2</sup>.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9692.%E2%80%85Blankets/783ee04d.png" data-original-src="https://upload.acmicpc.net/c5249fbe-db65-4534-8d84-117443c3bbbc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">The exact result is: (4 + 0 + 0 + 1 + 6 + 0) / 6</p>