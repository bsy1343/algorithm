# [Platinum IV] Lexicographical Lecturing - 20912

[문제 링크](https://www.acmicpc.net/problem/20912)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 109, 정답: 36, 맞힌 사람: 31, 정답 비율: 33.696%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>The OUG (&quot;Ordered University of Germany&quot;) is a renowned German university. Since it has a lot of students, student IDs are quite long strings of equal length $\ell$, where each student ID only contains lowercase letters of the English alphabet. Unfortunately for the students, the university&#39;s president hates chaos and expects students to always enter lecture halls in ascending lexicographic order of their IDs. As you can imagine, the process of sorting themselves in front of the lecture hall takes quite a lot of time for the students. Georgina, a computer science student, has the following idea to accelerate this process: She plans to fix two integers $i,j$ with $1 \leq i \leq j \leq \ell$ denoting a substring of the student ID starting at the $i$th letter and ending in the $j$th letter. Students then sort themselves lexicographically with respect to this substring of their student ID. Of course, $i$ and $j$ must be chosen in a way such that this new ordering is equal to the lexicographic ordering with respect to their complete IDs. In order to make the process as fast as possible, the length of the substring should be minimal. Can you help Georgina to solve this problem?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $\ell$, where
	<ul>
		<li>$n$ ($2 \leq n \leq 500$) is the number of student IDs;</li>
		<li>$\ell$ ($1 \leq \ell \leq 2 \cdot 10^4$) is the length of each student ID.</li>
	</ul>
	</li>
	<li>$n$ lines, the $i$th of which contains the student ID of the $i$th student.</li>
</ul>

<p>All student IDs only contain lowercase letters of the English alphabet, they are pairwise distinct and appear in ascending lexicographic order.</p>

### 출력

<p>Output two integers denoting the indices of the first and last letter of the shortest substring so that when students sort themselves lexicographically with respect to this substring of their student ID, the same order establishes as if students sorted themselves lexicographically with respect to their complete student ID.</p>

<p>If there are multiple shortest substrings, you may output any one of them.</p>