# [Gold II] Exam Study Planning - 30493

[문제 링크](https://www.acmicpc.net/problem/30493)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 26, 맞힌 사람: 22, 정답 비율: 55.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You have <em>a lot</em> of exams today! And you have not yet prepared for any of them! At least you know from experience that if you study enough for an exam, you will for sure pass it quickly, well within the allotted time. Even better, you stared so long at the daunting course curricula that you now know exactly how much time you will need to study for each exam in order to pass it within the given time. If you do not study long enough, you will for sure fail it.</p>

<p>As it happens, your university has some weird bureaucratic rules that require you to attend <em>all</em> your exams. The horror! And leaving early is not allowed, unless you know for sure you passed it!</p>

<p>Given the full exam schedule of when each exam starts, how long each exam takes, how much time you need to study for each exam, and how quickly you can finish each exam you studied for, how many exams can you pass at most?</p>

<p>You may start studying at time $0$, but can only study while not making an exam. The preparation for an exam does not have to be done in a contiguous block of time and may be interrupted.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer \(n\) (\(1 \leq n\leq 2000\)), the number of exams you have to attend.</li>
	<li>\(n\) lines, the \(i\)th of which contains four integers describing an exam:
	<ul>
		<li>\(s_i\) (\(0 \leq s_i\)), the start time of the \(i\)th exam,</li>
		<li>\(p_i\) (\(s_i &lt; p_i\)), the end time of the \(i\)th exam if you prepare for it,</li>
		<li>\(e_i\) (\(p_i \leq e_i \leq 10^9\)), the end time of the \(i\)th exam if you do not prepare for it,</li>
		<li>\(a_i\) (\(1 \leq a_i \leq 10^9\)), the time needed to prepare the \(i\)th exam.</li>
	</ul>
	</li>
</ul>

<p>The exams are given in ascending order of start time, and do not overlap, i.e. \(e_i \leq s_{i+1}\) holds for \(1 \leq i &lt; n\).</p>

### 출력

<p>Output the maximum number of exams you can pass.</p>