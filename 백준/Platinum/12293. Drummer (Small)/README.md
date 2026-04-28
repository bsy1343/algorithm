# [Platinum III] Drummer (Small) - 12293

[문제 링크](https://www.acmicpc.net/problem/12293)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 16, 맞힌 사람: 15, 정답 비율: 100.000%

### 분류

이분 탐색, 브루트포스 알고리즘, 볼록 껍질, 기하학, 수학, 매개 변수 탐색, 회전하는 캘리퍼스

### 문제 설명

<p>The drummer has a very important role in any band -- keeping the rhythm. If the drummer&#39;s rhythm is uneven, it can ruin the entire performance.</p>

<p>You are the lead singer of a very popular rock band, and you have a bit of a problem. Your drummer has just quit the band to become a professional video gamer. You need to find a new drummer immediately. Fortunately, there is no shortage of candidates. Everyone wants a chance to join your band. Your task is to find the best drummer among the candidates, and you want the person who can keep the most consistent rhythm.</p>

<p>Your plan is as follows. You will ask each candidate to audition individually. During the audition, the candidate will play one drum by striking it with a drum stick several times. Ideally, the time difference between consecutive strikes should be exactly the same, producing a perfect rhythm. In a perfect rhythm, the drum strikes will have time stamps that follow an arithmetic progression like this: T<sub>0</sub>, T<sub>0</sub> + K, T<sub>0</sub> + 2*K, ..., T<sub>0</sub> + (<strong>N</strong> - 1)*K.</p>

<p>In real life, of course, it is nearly impossible for a human to produce a perfect rhythm. Therefore, each candidate drummer will produce a rhythm that has an error <strong>E</strong>, such that each T<sub>i</sub> differs by at most <strong>E</strong> from some perfect rhythm. Given a candidate&#39;s sequence of drum strikes, find the smallest possible <strong>E</strong> among all perfect rhythms that the candidate might have been trying to play.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each one consists of two lines and represents the audition of one candidate. The first line contains a single integer -- <strong>N</strong>. The next line contains <strong>N</strong> integers separated by spaces -- the time stamps, in milliseconds, of the drum strikes played by the candidate. The time stamps are in increasing order.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>2 &le; <strong>N</strong> &le; 10.</li>
	<li>0 &le; T<sub>i</sub> &le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: <strong>E</strong>&quot;, where x is the case number (starting from 1) and <strong>E</strong> is the smallest among all possible numbers that describe the error of the candidate&#39;s drum strike sequence.</p>

<p>Your answer will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup> of the correct answer.</p>