# [Silver IV] Get a Rectangular Field - 22820

[문제 링크](https://www.acmicpc.net/problem/22820)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 73, 정답: 57, 맞힌 사람: 42, 정답 비율: 80.769%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Karnaugh is a poor farmer who has a very small field. He wants to reclaim wasteland in the kingdom to get a new field. But the king who loves regular shape made a rule that a settler can only get a rectangular land as his field. Thus, Karnaugh should get the largest rectangular land suitable for reclamation.</p>

<p>The map of the wasteland is represented with a 5 x 5 grid as shown in the following figures, where &#39;1&#39; represents a place suitable for reclamation and &#39;0&#39; represents a sandy place. Your task is to find the largest rectangle consisting only of 1&#39;s in the map, and to report the size of the rectangle. The size of a rectangle is defined by the number of 1&#39;s in it. Note that there may be two or more largest rectangles of the same size.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22820.%E2%80%85Get%E2%80%85a%E2%80%85Rectangular%E2%80%85Field/2a108ff5.png" data-original-src="https://upload.acmicpc.net/263f68e7-d4b3-4341-aad3-a69a684f77cd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure 1. The size of the largest rectangles is 4. There are two largest rectangles (shaded).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22820.%E2%80%85Get%E2%80%85a%E2%80%85Rectangular%E2%80%85Field/819cb945.png" data-original-src="https://upload.acmicpc.net/870369bb-c4da-46ad-a604-7b51dbbaec13/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure 2. The size of the largest rectangle is 3. There is one largest rectangle (shaded).</p>

### 입력

<p>The input consists of maps preceded by an integer&nbsp;<i>m</i>&nbsp;indicating the number of input maps.</p>

<dir>
</dir>

<pre>
<i>m</i>
<i>map</i><sub>1</sub>
<i>map</i><sub>2</sub>
<i>map</i><sub>3</sub>
...
<i>map</i><sub><i>m</i></sub>
</pre>

<p>Two maps are separated by an empty line.</p>

<p>Each&nbsp;<i>map</i><sub><i>k</i></sub>&nbsp;is in the following format:</p>

<dir>
</dir>

<pre>
<i>p p p p p</i>
<i>p p p p p</i>
<i>p p p p p</i>
<i>p p p p p</i>
<i>p p p p p</i>
</pre>

<p>Each&nbsp;<i>p</i>&nbsp;is a character either &#39;1&#39; or &#39;0&#39;. Two&nbsp;<i>p</i>&#39;s in the same line are separated by a space character. Here, the character &#39;1&#39; shows a place suitable for reclamation and &#39;0&#39; shows a sandy place. Each map contains at least one &#39;1&#39;.</p>

### 출력

<p>&nbsp;</p>

<p>The size of the largest rectangle(s) for each input map should be shown each in a separate line.</p>