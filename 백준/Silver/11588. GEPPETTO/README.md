# [Silver II] GEPPETTO - 11588

[문제 링크](https://www.acmicpc.net/problem/11588)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 159, 정답: 133, 맞힌 사람: 106, 정답 비율: 85.484%

### 분류

브루트포스 알고리즘, 비트마스킹, 백트래킹

### 문제 설명

<p>Everyone&rsquo;s favorite character and puppet-maker Geppetto has opened a new pizza place, the best in town. Geppetto is trying to make the best pizza possible, but at the same time he doesn&rsquo;t want to have a small selection of pizzas.</p>

<p>He makes his pizzas out of N ingredients marked with numbers from 1 to N. All that would be simple if he could mix any ingredient with every ingredient on the pizza, but unfortunately, that is not the case. Sometimes some ingredients cannot mix and that creates additional complications for our pizza master.</p>

<p>There are M pairs of ingredients that cannot be on the same pizza at the same time. Given these restrictions, Geppetto wants to know how many different pizzas he can make. Help him answer this question. Two pizzas are considered different if there is an ingredient of index i that is on one pizza, but not on the other.</p>

### 입력

<p>The first line of input contains two integers N and M (1 &le; N &le; 20, 1 &le; M &le; 400). Each of the following M lines contains two different numbers a i b, they represent the prohibition of mixing ingredients marked with a and b on the pizza. (1 &le; a, b &le; N). All pairs of ingredients are not necessarily distinct, some pair could occur multiple times.</p>

### 출력

<p>The first and only line of output must contain the number of different pizzas given the restrictions in the task.</p>

### 힌트

<p>Clarification of the first example: Geppetto can make pizzas consisting of the following ingredients: , 1, 1, 3, 2, 3. Notice that a pizza can be without ingredients.</p>

<p>Clarification of the second example: Geppetto can make a pizza using any combination of the ingredients.</p>

<p>Clarification of the third example: Geppetto can make a pizza that either doesn&rsquo;t contain any ingredients or contains only one ingredient.</p>