# [Platinum I] Yule Lads - 15868

[문제 링크](https://www.acmicpc.net/problem/15868)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 98, 정답: 70, 맞힌 사람: 56, 정답 비율: 71.795%

### 분류

수학, 정수론, 포함 배제의 원리, 뫼비우스 반전 공식

### 문제 설명

<p>The kids in Iceland are pretty lucky. Not only do they have one Santa Claus, but N of them! They&rsquo;re called the Yule Lads, and on each of the N nights before Christmas, one of them comes to town, giving those that have been nice a small present, and those that have been naughty a potato.</p>

<p>On a street in a small town in Iceland, there are N houses, numbered in turn from 1 to N. Each house is beautifully decorated with Christmas lights, and initially they are all turned on.</p>

<p>On each of the N nights before Christmas, one of the Yule Lads visits this street. The Yule Lad visiting K nights before Christmas is very fond of the number K, and will only visit the houses whose house number is divisible<sup>1</sup> by K. Furthermore, the Yule Lads are troublemakers, and will toggle the state of the Christmas lights on every house that they visit (i.e. turning the lights off if they are on, or turning them on if they are off).</p>

<p>However, some of the Yule Lads have been feeling sick, and did not come to town. On Christmas day all but the first house had their lights turned on. How many Yule Lads came to town?</p>

<p><sup>1</sup>An integer p is divisible by the integer q if the division p/q leaves no remainder.</p>

### 입력

<p>The first line of input contains a positive integer N, the number of Yule Lads and the number of houses in the street.</p>

### 출력

<p>Output a single integer, the number of Yule Lads that came to town. You can assume that there is only one scenario that leads to all houses having their lights on except for house number 1.</p>

### 힌트

<p>Consider the case N = 6. Then there are six Yule Lads, and six houses in the street. Here is what happens on each of the six nights before Christmas, assuming that no Yule Lad is sick.</p>

<ul>
	<li>Six nights before Christmas, the Yule Lad will turn the lights at house 6 off.</li>
	<li>Five nights before Christmas, the Yule Lad will turn the lights at house 5 off.</li>
	<li>Four nights before Christmas, the Yule Lad will turn the lights at house 4 off.</li>
	<li>Three nights before Christmas, the Yule Lad will turn the lights at house 3 off, and the lights at house 6 on.</li>
	<li>Two nights before Christmas, the Yule Lad will turn the lights at houses 2 and 6 off, and the lights at house 4 on.</li>
	<li>The night before Christmas, the Yule Lad will turn the lights at houses 1 and 4 off, and the lights at houses 2, 3, 5 and 6 on.</li>
</ul>

<p>However, house number 4 has its lights off on Christmas day, contrary to what actually happened.</p>

<p>On the other hand, if only the Yule Lad that was supposed to come into town four days before Christmas is sick, then all lights, except for at house number 1, will be lit on Christmas day. The correct answer is thus 5: Yule Lads came to town 6, 5, 3, 2 and 1 days before Christmas.</p>