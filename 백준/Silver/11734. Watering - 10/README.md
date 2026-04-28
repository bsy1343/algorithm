# [Silver III] Watering - 10 - 11734

[문제 링크](https://www.acmicpc.net/problem/11734)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 69, 정답: 53, 맞힌 사람: 44, 정답 비율: 75.862%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Sara is a dedicated farmer owning a large rectangular piece of land. Her land has a number of cells nicely arranged into a grid consisting of 5*R rows and 5*C columns. Furthermore, there is a horizontal fence across the width of the board after every fifth row and a vertical fence across the height of the board after every fifth column. The fences divide the land into R*C 5x5 areas called fields.</p>

<p>The two most common problems Sara faces are birds and droughts. To combat annoying crop-eating birds, some fields are equipped with a scarecrow. A scarecrow (if present) occupies a single cell and there can be at most one scarecrow in each 5x5 field.</p>

<p style="text-align:center"><img alt="" src="/upload/images3/watering1.png" style="height:209px; width:605px" /></p>

<p style="text-align:center">Figure 1: Example layout of Sara&rsquo;s land, its textual representation and a valid sprinkler arrangement</p>

<p>During droughts, which can last for months, Sara uses sprinklers to keep her crops watered. Each of her sprinklers has three nozzles: one main nozzle and two side nozzles. It occupies exactly three cells and waters all of them. The side nozzles always occupy exactly two cells that are adjacent (up, down, left or right) to the main nozzle. Hence, a single sprinkler is always in one of the following configurations:</p>

<p style="text-align:center"><img alt="" src="/upload/images3/watering2.png" style="height:63px; width:306px" /></p>

<p>Sara wants to put sprinklers on her land in such a way that there is exactly one sprinkler on every cell that is not occupied with a scarecrow. A cell containing a scarecrow must not contain a sprinkler nozzle. In addition, nozzles must not be placed outside Sara‟s land.</p>

<p>The three cells watered by a single sprinkler need not belong to the same 5x5 field: they may also belong to the neighboring fields. In that case, Sara has to drill a hole in the fence, between the two cells in neighboring fields watered by the same sprinkler. Drilling a hole is difficult for Sara: she does not want to drill many.</p>

<p>Given the description of Sara‟s land you need to produce a valid configuration of sprinklers to water it. If you succeed, your score will depend on the total number of holes that need to be made in the fences &ndash; see the Grading section for details.</p>

<p>This is an output only task. You will be given 10 input files and you only need to produce the matching output files. You may download the input files from the contest system, on the page labeled &#39;Tasks&#39;.</p>

<p>You need to submit each output file separately using the contest system. When submitting, the contest system will check the format of your output file. If the format is valid, the output file will be graded and the score reported; otherwise, the contest system will report an error. Hence, you will get full feedback for the output files submitted for this task.</p>

<p>Test data will be such that a solution always exists. If there is more than one solution, you may submit any one.</p>

### 입력

<p>The first line of the input contains a pair of integers R and C (1 &le; R, C &le; 100) &ndash; the size of Sara&#39;s land as described above.</p>

<p>6*R-1 lines follow, each containing a sequence 6*C-1 characters. They represent Sara&quot;s fields and fences between them. The fence itself is also represented with characters even though the fence is actually infinitely thin.</p>

<p>A single cell is represented by a single character. The dot character &quot;.&quot; represents an empty cell, while the &quot;#&quot; character (ASCII 35) represents a scarecrow. Vertical fences are represented by the &quot;|&quot; character (ASCII 124) and the horizontal fences with the &quot;-&quot; character (minus). The &quot;+&quot; character denotes an intersection of fences.</p>

### 출력

<p>The output file should contain the textual representation of the field with a valid sprinkler arrangement in the same format as the input file. Each hole in the fence should be denoted by the underscore character &quot;_&quot;. All empty cells (dots) from the input file should be replaced by lowercase letters &quot;a&quot; &ndash; &quot;z&quot; so that the following rules are satisfied:</p>

<ol>
	<li>Any three cells watered by the same sprinkler are denoted by the same letter, even if not all of them are in the same 5x5 field.</li>
	<li>If two adjacent cells in the same field are watered by different sprinklers, they must be denoted by different letters.</li>
	<li>If two adjacent cells in different fields are watered by different sprinklers and there is a hole in the fence between them, they must be denoted by different letters.</li>
	<li>It is allowed for adjacent cells that belong to different fields to be denoted by the same letter, as long as all the previous rules are satisfied.</li>
</ol>

### 힌트

<p>이 문제는&nbsp;<a href="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/data/watering.zip" style="line-height: 20.8px;">압축 파일</a>에 들어있는 watering10.in을&nbsp;이용해서 채점한다.</p>

<p>올바른 배치인 경우, 점수는 다음과 같이 주어진다:</p>

<ul>
	<li>구멍(hole)의 개수가 R*C&nbsp;개 보다 많지 않은 경우 100점</li>
	<li>그렇지 않은 경우 50점</li>
</ul>