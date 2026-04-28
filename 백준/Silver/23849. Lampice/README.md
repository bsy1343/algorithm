# [Silver III] Lampice - 23849

[문제 링크](https://www.acmicpc.net/problem/23849)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 20, 맞힌 사람: 19, 정답 비율: 90.476%

### 분류

브루트포스 알고리즘

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/23849.%E2%80%85Lampice/4482f75b.png" data-original-src="https://upload.acmicpc.net/b55ec73d-17b9-4674-92a4-39c696e8e0eb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 96px; float: right;" />Little Vera really likes Advent and Christmas time. Most of all, she likes colorful Christmas lights and enjoys decorating her balcony with shining colors. To decorate her balcony, she bought a sequence of $n$ lights connected in a row, each shining in one of a thousand different colors.</p>

<p>Apart from lights, Vera also really likes repeating patterns, so she would like to have her balcony decorated so that a certain pattern of colors repeats $k$ times in a row. However, the lamps she bought might not satisfy her obsession of repetition and patterns, so she decided to cut off zero or more lamps from the beginning and from the end of the sequence to obtain a sequence in which a pattern of colors repeats $k$ times in a row.</p>

<p>Help her determine whether she can obtain such a sequence of lights by making the mentioned cuts, and if so, print the pattern that will be repeated.</p>

### 입력

<p>The first line contains positive integers $n$ and $k$ ($1 &le; k &le; n &le; 50$) described above.</p>

<p>The second line contains a sequence of positive integers $a_1$, $a_2$, $\dots$, $a_n$ ($1 &le; a_i &le; 1000$) which denotes the colors of the lamps that Vera bought, in the order they appear in her sequence.</p>

### 출력

<p>If Vera can&rsquo;t cut out a sequence of lights that she wants, print -1.</p>

<p>If Vera can cut out a sequence of lights that she wants, in the first line print the length of the repeating pattern, and in the second line print the sequence of colors that makes up the pattern. If there is more than one solution, you can output any one of them.</p>

### 힌트

<p>Clarification of the third example: If Vera cuts off six lights from the end and zero from the beginning, she obtains the sequence of lights <code>1 5 1 5</code>, in which the pattern <code>1 5</code> repeats twice in a row. If, on the other hand, she cuts off four lights from the beginning and zero from the end, she obtains the sequence of lights <code>2 5 6 2 5 6</code>, in which the pattern <code>2 5 6</code> repeats twice, so this is also a valid solution.</p>