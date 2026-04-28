# [Bronze III] Kathmandu - 23397

[문제 링크](https://www.acmicpc.net/problem/23397)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 539, 정답: 294, 맞힌 사람: 266, 정답 비율: 54.397%

### 분류

구현

### 문제 설명

<p>The pandemic is getting better and you can finally do the thing you&rsquo;ve been dreaming of for the past few years: eat at your favorite restaurant! The restaurant happens to be in Kathmandu, but that&rsquo;s fine, you can always take a plane.</p>

<p>The problem is that planes almost always leave you restless. You consider yourself properly rested if you can sleep for T uninterrupted minutes, which means you are never awake from a certain moment t to t + T. Also, you&rsquo;re a very easy sleeper: you can fall asleep at the start of any minute and wake up at the end of any minute.</p>

<p>Of course, if you sleep too much you will miss all the airplane meals! That is unacceptable, as no opportunity for free food should go to waste.</p>

<p>Luckily, the airplane company sent you the whole flight schedule: the duration of the flight, D minutes, the number of meals that are going to be served, M, and the exact time they will serve the meals, y<sub>i</sub>. You need to be awake at the time the meal is being served to be able to eat it, otherwise, the steward will not serve you. Since you&rsquo;re always hungry, you will devour the meal instantly.</p>

<p>Now you are wondering, for the optimal plane traveling experience, can you get properly rested and still eat all meals during the flight?</p>

### 입력

<p>The first line of input contains three integers, T, D, M (1 &le; T, D &le; 10<sup>5</sup>, 0 &le; M &le; 1000), representing, respectively, the number of minutes you need to sleep without interruption to be properly rested, the duration of the flight and the number of meals that are going to be served during the flight.</p>

<p>Each of the next M lines contains an integer y<sub>i</sub> (0 &le; y<sub>i</sub> &le; D). These integers represent the times at which each meal is going to be served, and are given in chronological order.</p>

### 출력

<p>Output a line containing one character. If you can get properly rested and still eat all meals during the flight, write the upper case letter &lsquo;<code>Y</code>&rsquo;; otherwise write the uppercase letter &lsquo;<code>N</code>&rsquo;.</p>