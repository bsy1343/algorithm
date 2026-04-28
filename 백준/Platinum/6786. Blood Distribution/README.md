# [Platinum IV] Blood Distribution - 6786

[문제 링크](https://www.acmicpc.net/problem/6786)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 103, 정답: 41, 맞힌 사람: 39, 정답 비율: 43.333%

### 분류

그래프 이론, 최대 유량

### 문제 설명

<p>At the Canadian Cardiac Centre there are four types of blood available: O, A, B, and AB. Each of these types of blood has an Rh factor, which is either &ldquo;positive&rdquo; or &ldquo;negative&rdquo;. There are many patients who each require 1 unit of blood. Each patient&rsquo;s blood type determines the type of blood s/he may receive:</p>

<ul>
	<li>Each Type O patient requires Type O blood.</li>
	<li>Each Type A patient may receive blood of Type A or Type O.</li>
	<li>Each Type B patient may receive blood of Type B or Type O.</li>
	<li>The Type AB patients may receive blood of any type.</li>
</ul>

<p>Patients who have Rh-negative blood can accept Rh-negative blood only, but patients with Rhpositive blood can accept either Rh-positive or Rh-negative types of blood.</p>

<p>We want as many patients as possible to receive a unit of blood. What is the maximum number of patients that can receive blood?</p>

### 입력

<p>The first line of input contains 8 integers: the number of units of blood of Type O negative, O positive, A negative, A positive, B negative, B positive, AB negative and AB positive. This is followed by a line containing eight numbers: the number of patients whose blood type is O negative, O positive, A negative, A positive, B negative, B positive, and AB negative and AB positive. Each of these integers will be at least 0 and less than 10<sup>7</sup> .</p>

### 출력

<p>The output of your program should be a single number: the maximum number of patients that can receive blood.</p>

### 힌트

<ul>
	<li>2 Type O- patients receive Type O- blood</li>
	<li>4 Type O+ patients receive Type O+ blood</li>
	<li>3 Type A- patients receive Type A- blood</li>
	<li>3 Type A- patients receive Type 0- blood</li>
	<li>1 Type A+ patients receive Type A+ blood</li>
	<li>1 Type A+ patients receive Type O+ blood</li>
	<li>2 Type B- patients receive Type B- blood</li>
	<li>9 Type B+ patients receive Type B+ blood</li>
	<li>5 Type AB- patient receives Type AB- blood</li>
	<li>3 Type AB+ patients receive Type AB+ blood</li>
</ul>