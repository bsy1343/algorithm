# [Gold III] Manage your Energy (Large) - 12332

[문제 링크](https://www.acmicpc.net/problem/12332)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 29, 맞힌 사람: 24, 정답 비율: 51.064%

### 분류

구현, 자료 구조, 그리디 알고리즘, 시뮬레이션, 스택

### 문제 설명

<p>You&#39;ve got a very busy calendar today, full of important stuff to do. You worked hard to prepare and make sure all the activities don&#39;t overlap. Now it&#39;s morning, and you&#39;re worried that despite all of your enthusiasm, you won&#39;t have the energy to do all of this with full engagement.</p>

<p>You will have to manage your energy carefully. You start the day full of energy - <strong>E</strong> <a href="http://en.wikipedia.org/wiki/Joule">joules</a> of energy, to be precise. You know you can&#39;t go below zero joules, or you will drop from exhaustion. You can spend any non-negative, integer number of joules on each activity (you can spend zero, if you feel lazy), and after each activity you will regain <strong>R</strong> joules of energy. No matter how lazy you are, however, you <strong>cannot</strong> have more than <strong>E</strong> joules of energy at any time; any extra energy you would regain past that point is wasted.</p>

<p>Now, some things (like solving Code Jam problems) are more important than others. For the <strong>i</strong>th activity, you have a value <strong>v</strong><strong><sub>i</sub></strong> that expresses how important this activity is to you. The <em>gain</em> you get from each activity is the value of the activity, multiplied by the amount of energy you spent on the activity (in joules). You want to manage your energy so that your total gain will be as large as possible.</p>

<p>Note that you <em>cannot</em> reorder the activities in your calendar. You just have to manage your energy as well as you can with the calendar you have.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case is described by two lines. The first contains three integers: <strong>E</strong>, the maximum (and initial) amount of energy, <strong>R</strong>, the amount you regain after each activity, and <strong>N</strong>, the number of activities planned for the day. The second line contains <strong>N</strong> integers <strong>v</strong><strong><sub>i</sub></strong>, describing the values of the activities you have planned for today.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>1 &le; <strong>E</strong> &le; 10<sup>7</sup>.</li>
	<li>1 &le; <strong>R</strong> &le; 10<sup>7</sup>.</li>
	<li>1 &le; <strong>N</strong> &le; 10<sup>4</sup>.</li>
	<li>1 &le; <strong>v</strong><strong><sub>i</sub></strong> &le; 10<sup>7</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: <strong>y</strong>&quot;, where <strong>x</strong> is the case number (starting from 1) and <strong>y</strong> is the maximum gain you can achieve by managing your energy that day.</p>

### 힌트

<p>In the first case, we can spend all 5 joules of our energy on the first activity (for a gain of 10), regain 2 and spend them on the second activity. In the second case, we spend 2 joules on the first activity, regain them, and spend 5 on the second. In the third case, our regain rate is equal to the maximum energy, meaning we always recover all energy after each activity - so we can spend full 3 joules on each activity.</p>