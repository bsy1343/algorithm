# [Platinum IV] Ghostbusters - 14994

[문제 링크](https://www.acmicpc.net/problem/14994)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 21, 맞힌 사람: 21, 정답 비율: 72.414%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>The Bureau of Approved Peripherals for Computers (BAPC) is designing a new standard for computer keyboards. With every new norm and regulation, hardware becomes obsolete easily, so they require your services to write firmware for them.</p>

<p>A computer keyboard is an array of M rows and N columns of buttons. Every button has an associated probability. Furthermore, every column and every row of buttons has an associated cable, and every pressed button connects their row cable with their column cable (and vice versa!). The keyboard detects key presses by &ldquo;sampling&rdquo;. It sends an electric signal through the first row. This signal spreads to columns that are connected to it through pressed buttons on that column and to rows connected to these columns through other pressed buttons and so on. Every row or column that is connected, possibly indirectly, to the original row via pressed buttons receives the signal. The firmware stores which columns have received the signal. This process is repeated for every row.</p>

<p>It is easy to identify what was pressed if only one key was pressed. In this case only one pair (row, column) will make contact. But keyboards allow to press more than one key at the same time and unfortunately some combinations of key presses are impossible to tell apart. This phenomenon is called &ldquo;ghosting&rdquo;. For example, in a 2 &times; 2 keyboard, all combinations of three or four presses are impossible to tell apart, since every pair (row, column) makes electric contact (maybe indirectly), as can be seen in Figure 3.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14994.%E2%80%85Ghostbusters/7f6d073a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14994/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:94px; width:431px" /></p>

<p style="text-align:center">Figure 3: Four examples of connected wires in a keyboard. Bold lines of the same colour indicate wires that are connected via pressed buttons, which are depicted as red dots. The two sets of pressed buttons on the right cannot be distinguished from each other, since they connect the same rows and columns.</p>

<p>The BAPC wants to deal with the problem of ghosting by finding the most likely combination of pressed keys that could have produced a particular set of signals.</p>

### 입력

<p>The input consists of</p>

<ul>
	<li>A line containing two integers, M the number of rows of the keyboard and N the number of columns, with 1 &le; M, N &le; 500.</li>
	<li>M lines with N numbers each, where the j th number in the i th line indicates the probability 0 &lt; p &lt; 0.5 that the key in row i and column j is pressed. Here 0 &le; i &le; M &minus; 1 and 0 &le; j &le; N &minus; 1.</li>
	<li>M lines, each with an integer 0 &le; k &le; N and a list of k integers. The list of integers on the i th line indicates the columns that received the signal emitted by the i th row.</li>
</ul>

### 출력

<p>Output the set of pressed keys that is most likely given the input. Any solution that achieves the maximum probability will be accepted. For each pressed key output a line with two integers r and c, separated by a space, indicating the row r and the column c of the key. The lines must be outputted in lexicographical order, that is, output first the keys whose row is lower and if the rows are the same output first the key whose column is lower.</p>