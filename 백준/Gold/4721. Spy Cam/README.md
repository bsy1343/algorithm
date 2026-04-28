# [Gold II] Spy Cam - 4721

[문제 링크](https://www.acmicpc.net/problem/4721)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>An overhead camera has snapped a photo of the papers on a bureaucrat&rsquo;s desk. Many of the papers overlap, but, because the bureaucrat in questions is a bit of a neatness freak, all papers are aligned with their edges parallel to the edges of the desk. As a preliminary step in analyzing these papers, other programs have used cues of paper color, edges, etc., to label each pixel in the image according to which sheet of paper is visible in that particular location. The result will look something like this</p>

<pre>
...aaaaaaaa.dd
...aaaaaaaa.ee
.ccaaaaaaaa...
.ccaaaabbaa...
.ccaaaabbaa...
.ccaaaabbaa...
.ccaaaaaaaa...
..............</pre>

<p>A &lsquo;.&rsquo; denotes the desktop, and alphabetic labels &lsquo;a&rsquo;, &lsquo;b&rsquo;, &lsquo;c&rsquo;, etc., denote distinct pieces of paper. These labels are assigned in an arbitrary order but are dense (no letters are &rdquo;skipped&rdquo; during the labeling).</p>

<p>Assume that each paper is rectangular, and that no important information is being lost &ldquo;between&rdquo; the pixels. Assume also that the camera has recorded the entire desktop and that there are no papers that are completely hidden from view.</p>

<p>For each piece of paper (ordered by label), determine if the visual evidence proves that the entire sheet of paper is visible or if it is at least possible that a portion of the paper is hidden beneath another sheet.</p>

### 입력

<p>Input will consist of several snapshots.</p>

<p>Each snapshot begins with a line containing two integers, R and C, denoting the number of rows and columns of pixels in the snapshot. For each snapshot, 1 &le; R, C &le; 40.</p>

<p>The R and C values are followed by R lines, each containing C characters. Those characters will be lower-case alphabetic characters or a period (&rsquo;.&rsquo;). As noted earlier, the alphabetic characters denote visible portions of distinct sheets of paper and the periods denote portions of the underlying desktop.</p>

<p>All snapshots in the input will correspond to a valid arrangement of rectangular sheets of paper. There will be no impossible arrangements.</p>

<p>The final snapshot will be followed by a line containing two zeros separated by a space.</p>

### 출력

<p>For each snapshot, print one line of output. That line will begin with the phrase &ldquo;Uncovered:&rdquo; followed by a single space. Then, on the same line, list the papers that are definitely completely visible, in order of character code, with no separating spaces.</p>