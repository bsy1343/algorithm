# [Platinum V] Allergy Test - 5034

[문제 링크](https://www.acmicpc.net/problem/5034)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 22, 맞힌 사람: 17, 정답 비율: 40.476%

### 분류

백트래킹, 비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>A test for allergy is conducted over the course of several days, and consists of exposing you to different substances (so called allergens). The goal is to decide exactly which of the allergens you are allergic to. Each allergen has a live duration D measured in whole days, indicating exactly how many days you will suffer from an allergic reaction if you are allergic to that particular substance. An allergic reaction starts to show almost immediately after you have been exposed to an allergen which you are allergic to. The test scheme has two action points per day:</p>

<ul>
	<li>I At 8 o&rsquo;clock each morning, at most one of the allergens is applied to your body.</li>
	<li>II At 8 o&rsquo;clock each evening, you are examined for allergic reactions.</li>
</ul>

<p>Thus an allergen with live duration D will affect exactly D allergic reaction examinations.</p>

<p>Of course, if you have two or more active allergens in your body at the time of an observed reaction, you cannot tell from that information only, which of the substances you are allergic to.</p>

<p>You want to find the shortest possible test scheme given the durations of the allergens you want to test. Furthermore, to allow simple large scale application the test scheme must be non-adaptive, i.e. the scheme should be fixed in advance. Thus you may not choose when to apply an allergen based on the outcome of previous allergic reaction examinations.</p>

### 입력

<p>The first line of the input contains a single integer k (1 &le; k &le; 20) specifying the number of allergens being tested for. Then follow k lines each containing an integer D (1 &le; D &le; 7) specifying the live duration of each allergen.</p>

### 출력

<p>The number of days of the shortest conclusive non-adaptive test scheme.</p>

<p>A scheme ends the morning when you no longer have active allergens in your body, thus a test scheme for a single allergen with live duration D takes D days.</p>