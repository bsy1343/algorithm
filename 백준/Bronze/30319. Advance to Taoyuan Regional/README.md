# [Bronze IV] Advance to Taoyuan Regional - 30319

[문제 링크](https://www.acmicpc.net/problem/30319)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 1081, 정답: 755, 맞힌 사람: 677, 정답 비율: 70.301%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>In the last cycle, the domestic team selection process of ICPC Taoyuan Regional Contest chooses teams from preliminary contests according to the following categories.</p>

<ul>
	<li>Category 1: Among the teams that participated in the &quot;ICPC Taiwan Online Programming Contest&quot; (TOPC) and solved one problem, the best team from each university will be selected. This category is limited to 30 teams.</li>
	<li>Category 2: The top 40 teams in the &quot;National Collegiate Programming Contest&quot; will be selected.</li>
	<li>Category 3: &quot;Taiwan Private University Programming Contest&quot; qualifies 10 best teams, but no more than two teams per university.</li>
	<li>Category 4: &quot;Taiwan Technology University Programming Contest&quot; qualifies 10 best teams, but no more than two teams per university.</li>
	<li>Category 5: 10 teams will be qualified for their CPE performance, but no more than one team from each university. Such teams must participate in TOPC and solve at least one problem.</li>
	<li>Category 6: If a team of the above five categories resigns for any reason and there are other teams from the same university participating in TOPC. The replacement of the resigning team will be selected from the TOPC participants from the same university according to their performance.</li>
	<li>Category 7: If the total number of teams in the above six categories is less than 100, the organizer will invite the top teams of TOPC to participate in the regional contest. The invited teams must be in the top half of the final standings.</li>
	<li>Category 8: Free to participate, priority will be given to universities not selected in the above categories and will be ranked according to the order of registration.</li>
</ul>

<p>The domestic team selection rule of ICPC Taoyuan Regional Contest has a major change in the 2023-2024 cycle. The organizer added a note, &quot;If the list of selected teams cannot be submitted 35 days prior to the ICPC Taoyuan Regional Contest, the category will be subject to suspension for that particular year.&quot; This change was made to deal with the fact that some preliminaries were held to late. Typically, it takes about five weeks to complete the logistic operations of an ICPC regional contest. Therefore, all preliminaries were held before the end of Octobor, and the regional contests were held in November in the past few years.</p>

<p>The 2023 ICPC Taoyuan Regional Contest will be held from Octobor 21 to Octobor 23, 2023. Consequently, some categories will be suspended if the corresponding preliminaries are still held in late September or Octobor as usual. As the director of TOPC, you must be wise enough to choose a proper date to hold TOPC. If the categories related to TOPC are suspended, there will be much less domestic teams competing in the 2023 ICPC Taoyuan Regional Contest. A contest date is too late for TOPC if it is not at least 35 days prior to Octobor 21, 2023. Please write a program to determine whether a tentative contest date is too late for TOPC.</p>

### 입력

<p>The input contains a string in ISO 8601 format <code>YYYY-MM-DD</code> indicating the tentative contest date for TOPC. <code>YYYY</code>, <code>MM</code>, <code>DD</code> are the year, the month, the day of the tentative contest date for TOPC, respectively.</p>

### 출력

<p>If the tentative contest date is too late, output &quot;<code>TOO LATE</code>&quot; without quotes. Otherwise, output &quot;<code>GOOD</code>&quot; without quote.</p>

### 제한

<ul>
	<li><code>YYYY</code> is $2023$.</li>
	<li><code>MM</code> is from $1$ to $12$.</li>
	<li><code>DD</code> is from $1$ to $28$.</li>
</ul>