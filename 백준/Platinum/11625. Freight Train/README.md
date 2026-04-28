# [Platinum IV] Freight Train - 11625

[문제 링크](https://www.acmicpc.net/problem/11625)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 104, 정답: 38, 맞힌 사람: 36, 정답 비율: 45.570%

### 분류

애드 혹, 이분 탐색, 값 / 좌표 압축, 다이나믹 프로그래밍, 그리디 알고리즘, 매개 변수 탐색

### 문제 설명

<p>The chemical company NS (Nasty Substances) has three factories: one in the Netherlands, one in Belgium and one in Luxembourg. Chemicals are moved between the factories on a regular basis, which is always done by freight train. Last night, the the weekly shipment of chemicals was again sent from the factory in the Netherlands to the factory in Belgium. However, something has gone wrong: some of the chemicals that arrived in Belgium were supposed to go to the factory in Luxembourg. What&rsquo;s more, the Luxumbourg chapter is eagerly awaiting the arrival of its chemicals, as any delay in delivery causes major issues in the production pipeline.</p>

<p>In order to make sure that the error can be corrected as quickly as possible, an additional L &minus; 1 locomotives are sent towards the freight train, which is currently stationed at the Belgian factory. (Thus, in total there are now L locomotives available.) Each locomotive can pick up some initial segment of the train (that is, the first K wagons) and transport it either back to the Netherlands or on towards Luxembourg. There is no time to do more elaborate rearrangements of the freight train. Since time is of the essence, you want the trains going to Luxembourg to be as short as possible: shorter trains can move faster. Trains heading back to Holland can be as long as you want. You are given a list of the wagons that need to go to Luxembourg. All the other wagons are empty and can either be carried along to the Luxembourg plant as well, or be driven back to the Netherlands. No wagon can be left behind. Your task is to split the freight train into (at most) L consecutive trains so that the largest train heading for Luxembourg is as short as possible.</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with three space-separated integers N, W and L, satisfying 1 &le; N &le; 10<sup>9</sup> and 1 &le; W, L &le; 10,000 and W &le; N. These denote the number of wagons of the freight train stationed in Belgium, the number of wagons still containing freight and the number of locomotives.</li>
	<li>One line with W space-separated integers, denoting the numbers of the wagons that still contain freight in ascending order. Wagons are numbered 1 through N.</li>
</ul>

### 출력

<p>For each test case, output one line with a single integer, denoting the number of wagons of the longest train heading for Luxembourg.</p>

### 힌트

<p>In the first test case, you take the first two wagons and send them towards Luxembourg. The remaining wagons can go back to the Netherlands.</p>

<p>In the second test case, your best option is to simply split the train in three parts, each of which heads for Luxembourg.</p>

<p>In the third test case, split the train into three parts of two wagons each. Two of those are sent towards Luxembourg. Note that one of the locomotives remains unused.</p>