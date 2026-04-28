# [Gold III] Teacher Sorting - 23860

[문제 링크](https://www.acmicpc.net/problem/23860)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>The 9-th grade students are doing Physical Education, they have just run a long distance. The lesson is approaching its end, so the teacher asked students to stand in a line in non-decreasing order of their heights. Students don&#39;t always pay their attention, so sometimes they stand in a line not in the order they were asked. The teacher wants to fix the problem.</p>

<p>The teacher looks at the line, and if it&#39;s not ordered properly, chooses the $i$-th and the $j$-th student in the line, and swaps them. So after the swap, a the $i$-th student becomes the $j$-th student, and the other way around. Teacher keeps doing swaps, until the line is ordered properly. Formally speaking, until for all $i$ --- the $(i+1)$-th student is not shorter than the $i$-th student in the line.</p>

<p>Although today it won&#39;t be easy for the teacher. Students are very tired after the run so they can hardly stand. The teacher doesn&#39;t want to overload them physically, so the teacher won&#39;t move any student more than once.</p>

<p>The teacher needs your help. You are given the line: $a_1, a_2, \ldots, a_n$ --- the heights of the students. Find the sequence of swaps for teacher to make the line ordered properly, or say that it&#39;s not possible.</p>

### 입력

<p>The first line contains an integer $n$ --- the number of students ($1 \le n \le 2 \cdot 10^5$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($0 \le a_i \le 10^9$). The number $a_i$ is the height of the $i$-th student in the line.</p>

### 출력

<p>If the teacher won&#39;t be able to order the students properly, print &quot;<code>No</code>&quot;.</p>

<p>Otherwise, print &quot;<code>Yes</code>&quot; in the first line. In the second line print an integer $k$ --- the number of swaps the teacher needs to make. In each of the next $k$ lines print two integers $i$ and $j$, denoting that the teacher should swap the $i$-th and the $j$-th students in the line.</p>

<p>Note that you don&#39;t have to minimize the number of swaps. You can print any sequence that will make the line ordered properly in a way that no student was swapped more than once.</p>