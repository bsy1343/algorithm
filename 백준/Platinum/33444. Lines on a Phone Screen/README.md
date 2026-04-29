# [Platinum I] Lines on a Phone Screen - 33444

[문제 링크](https://www.acmicpc.net/problem/33444)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

세그먼트 트리, 자료 구조

### 문제 설명

<p>Suppose that there is a sequence of $k$ sentences in a mobile phone. To describe the length of each sentence, we use an integer sequence $S = (s_1, s_2, \ldots, s_k)$, where $s_i$ is the length of the $i$-th sentence. It is guaranteed that $1 \le s_i \le 24$.</p>

<p>To show users the sentences, the mobile phone will print them in order. However, because of the width limitation of the screen, the total length of the sentences in one line should not exceed $24$. Moreover, to make sentences reader-friendly, every sentence should be put in exactly one line (in other words, a sentence cannot be split into multiple lines).</p>

<p>The rule to satisfy the requirements is as follows. The first sentence is printed on the first line. For $i \ge 2$, the mobile phone prints the $i$-th sentence in the last line if the line length does not exceed $24$ after that. Otherwise, it starts a new line and prints the $i$-th sentence in it.</p>

<p>For example, if $S = (8, 8, 9, 12, 13)$, the sentences will be printed like this:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33444.%E2%80%85Lines%E2%80%85on%E2%80%85a%E2%80%85Phone%E2%80%85Screen/d5ec2512.png" data-original-src="https://boja.mercury.kr/assets/problem/33444-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>Now, here is the problem.</p>

<p>There are $n$ sentences, and their lengths are $a_1, a_2, \ldots, a_n$ ($1 \le a_i \le 24$).</p>

<p>And there are $m$ operations to do. Each operation belongs to one of the two types below:</p>

<ul>
	<li>$\mathit{op1}(x, c)$: Change the length of the $x$-th sentence from $a_x$ to $c$.</li>
	<li>$\mathit{op2}(\ell, r)$: Determine the number of lines on the screen when printing the sentences with lengths $S = (a_{\ell}, a_{\ell + 1}, a_{\ell + 2}, \ldots, a_{r})$ on the mobile phone.</li>
</ul>

<p>Your task is to answer all questions given by the operations of the second type.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 \le n, m \le 10^5$) denoting the number of sentences and the number of operations, respectively.</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($1 \le a_i \le 24$) denoting the lengths of the sentences.</p>

<p>Then $m$ lines follow. Each of them contains three integers and represents one of the two types of operations:</p>

<ul>
	<li>"<code>1</code> $x$ $c$": Change the length of the $x$-th sentence from $a_x$ to $c$ ($1 \le x \le n$, $1 \le c \le 24$).</li>
	<li>"<code>2</code> $\ell$ $r$": Print the number of lines when printing sentences from $\ell$-th to $r$-th on the screen ($1 \le \ell \le r \le n$).</li>
</ul>

### 출력

<p>For each operation of the second type, print a single line with the answer.</p>