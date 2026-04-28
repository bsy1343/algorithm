# [Gold IV] Falling Leaves - 4661

[문제 링크](https://www.acmicpc.net/problem/4661)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 49, 정답: 35, 맞힌 사람: 31, 정답 비율: 72.093%

### 분류

구현, 트리

### 문제 설명

<p>Consider the following sequence of operations on a binary search tree of letters</p>

<p style="margin-left:40px">Remove the leaves and list the data removed&nbsp;<br />
Repeat this procedure until the tree is empty</p>

<p>Starting from the tree below on the left, we produce the sequence of trees shown, and then the empty tree&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4661.%E2%80%85Falling%E2%80%85Leaves/d66b3d05.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4661.%E2%80%85Falling%E2%80%85Leaves/d66b3d05.gif" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/4661/leaves2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><br />
&nbsp;<br />
by removing the leaves with data</p>

<p style="margin-left:40px">BDHPY&nbsp;<br />
CM&nbsp;<br />
GQ&nbsp;<br />
K</p>

<p>Your problem is to start with such a sequence of lines of leaves from a binary search tree of letters and output the preorder traversal of the tree.</p>

### 입력

<p>The input file will contain one or more data sets. &nbsp;Each data set is a sequence of one or more lines of capital letters. &nbsp;The lines contain the leaves removed from a binary search tree in the stages described above. &nbsp;The letters on a line will be listed in increasing alphabetical order. &nbsp;Data sets are separated by a line containing only an asterisk (&#39;*&#39;). &nbsp;The last data set is followed by a line containing only a dollar sign (&#39;\$&#39;). &nbsp;There are no blanks or empty lines in the input.</p>

### 출력

<p>For each input data set, there is a unique binary search tree that would produce the sequence of leaves. &nbsp;The output is a line containing only the preorder traversal of that tree, with no blanks.</p>

<p>&nbsp;</p>