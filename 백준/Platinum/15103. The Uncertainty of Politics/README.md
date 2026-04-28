# [Platinum III] The Uncertainty of Politics - 15103

[문제 링크](https://www.acmicpc.net/problem/15103)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>You have an upcoming trip to Washington D.C. and you are fascinated with the intricacies of Congressional committee hearings. You wish to attend as many hearings as possible during your trip, and your local representative has provided you with a pass that will get you into the audience of any hearing. But there are some challenges in planning your schedule. Specifically:</p>

<ol>
	<li>There are many committees, and thus many hearings, some of which take place at overlapping times.</li>
	<li>While the committees are extremely punctual in terms of when to start a hearing, they are notoriously unpredictable in terms of how long the hearing lasts. Fortunately, rules do not actually allow for a filibuster of a committee hearing, so they cannot last forever.</li>
	<li>It is considered rude to enter a hearing that is already underway, or to leave a hearing before it is complete. Given that you do not wish to embarrass the representative who provided your tickets, if you attend you must attend the entire hearing. Fortunately, hearings are very near to each other; as soon as one hearing is done, you can immediately join another hearing that is about to start.</li>
</ol>

<p>Well in advance of your trip, Congress publishes a schedule of hearings, indicating for each one the time s at which the hearing will start, and then values a and b which represent, respectively, the shortest and longest possible length of that particular hearing. You are to assume that the actual length of the hearing will be a uniformly random integer over the inclusive interval [a, b].</p>

<p>Your goal is to develop a strategy that maximizes the expected number of hearings that you can attend during your trip. As an example, consider a situation in which there are four hearings with parameters as follows:</p>

<table class="table table-bordered" style="width:40%">
	<thead>
		<tr>
			<th>hearing</th>
			<th>s</th>
			<th>a</th>
			<th>b</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>Social media and elections</th>
			<td>1</td>
			<td>1</td>
			<td>7</td>
		</tr>
		<tr>
			<th>NASA missions</th>
			<td>3</td>
			<td>2</td>
			<td>3</td>
		</tr>
		<tr>
			<th>Oil and gas exploration</th>
			<td>5</td>
			<td>1</td>
			<td>4</td>
		</tr>
		<tr>
			<th>Hurricane recovery efforts</th>
			<td>6</td>
			<td>10</td>
			<td>10</td>
		</tr>
	</tbody>
</table>

<p>For this schedule, the optimal strategy will allow you to achieve an expected value of 2.125 hearings. To achieve this, you begin by attending the NASA hearing, which starts at time 3 and ends with equal probability at either time 5 or time 6 (given the hearing length that is uniformly distributed over {2, 3}). If the NASA hearing does end at time 5 you will immediately head to the oil and gas exploration hearing, and there is a 1/4 chance that hearing will end at time 6, allowing you to make yet a third hearing (about hurricane recovery efforts). If the NASA hearing instead ends at time 6, you will go straight to the hurricane hearing.</p>

<p>By this strategy you will attend 3 hearings 12.5% of the time and 2 hearings the other 87.5% of the time, and thus expected value of 2.125. Note that if you were to start by attending the social media and elections hearing, you might optimistically make four hearings. However, a careful analysis will demonstrate that if you attend the first hearing, your optimal expected value is only 2.10714.</p>

### 입력

<p>The input begins with an integer n that designates the total number of scheduled hearings (1 &le; n &le; 10<sup>4</sup>). Following that are n lines, each containing three integers s, a, and b, respectively representing the start time, minimum length, and maximum length of a hearing, such that 1 &le; s &le; 10<sup>6</sup> and 1 &le; a &le; b &le; 10<sup>6</sup>. The hearings will be listed in nondecreasing order of their start times.</p>

### 출력

<p>Display the expected number of hearings of an optimal strategy. Your answer should have an absolute or relative error of at most 10<sup>&minus;3</sup>.</p>