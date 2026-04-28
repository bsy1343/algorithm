# [Gold II] SLIKA - 3146

[문제 링크](https://www.acmicpc.net/problem/3146)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

(분류 없음)

### 문제 설명

<p>Mirko was bored during computer class, so he decided to open &quot;Paint&quot; and have some fun. He created a new image N&times;N pixels in size.&nbsp;</p>

<p>Because he wasn&#39;t paying attention when the teacher was explaining how to use &quot;Paint&quot;, Mirko only knows how to draw squares, of various colors. First he drew a square of color 1, then one of color 2 (which may have covered part of the first square) and so forth until square K.&nbsp;</p>

<p>When the teacher saw Mirko wasting his time, she immediately sent him to the principal. However, when she looked carefully at the image, she was intrigued by the unusual scrawl. She figured out the way the image was drawn. However, she couldn&rsquo;t figure out the initial lengths of the squares&#39; sizes.&nbsp;</p>

<p>She deduced that, for each color A, it is possible to find an interval [a, b] such that for each x in that interval, it is possible that the length of the sides of square A could be x.&nbsp;</p>

<p>Write a program which helps Mirko&rsquo;s teacher find the largest associated interval for each color.&nbsp;</p>

### 입력

<p>The first line of input contains two integers N and K (1 &le; N &le; 1 000, 1 &le; K &le; 9), the dimensions of the image and the number of squares Mirko drew.&nbsp;</p>

<p>Each of following N lines contains N characters. Those characters are either &#39;.&#39; or one of the digits 1 to K. The &#39;.&#39; character means that no square ever covered the pixel. The digit x means that the last square to cover that pixel was one with the color x.&nbsp;</p>

### 출력

<p>The output should contain K lines. In each of the lines you should output two integers. The two integers on line i represent the smallest and largest possible lengths of the side of square i.&nbsp;</p>