# [Platinum III] Take-out - 8240

[문제 링크](https://www.acmicpc.net/problem/8240)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 94, 정답: 48, 맞힌 사람: 43, 정답 비율: 53.086%

### 분류

자료 구조, 스택

### 문제 설명

<p>Little Edna has received the take-out game as a present. Take-out is a single player game, in which the player is given a sequence of n adjacent blocks, numbered from 1 to n. Each block is either black or white, and there are k times as many white blocks as there are black ones.</p>

<p>The player&#39;s goal is to remove all the blocks by certain permissible moves.</p>

<p>A single move consists in removing exactly k white blocks and a single black block without changing the positions of other blocks. The move is permissible if there is no &quot;gap&quot; (a space left by a previously taken out block) between any two blocks being removed.</p>

<p>Help poor little Edna in finding any sequence of permissible moves that remove all the blocks.</p>

### 입력

<p>In the first line of the standard input there are two integers, n and k (2 &le; n &le; 1,000,000, 1 &le; k &le; n-1), separated by a single space, that denote the total number of blocks used in the game, and the number of white blocks per black node (to be removed in every move). In all the tests the condition k+1|n holds.</p>

<p>In the second line there is a string of n letters b or c. These tell the colours of successive blocks (in Polish): b (for biały) - white, c (for czarny) - black. You may assume that in all the tests there exists a sequence of permissible moves that takes out all the blocks.</p>

### 출력

<p>Your program should print \( \frac{n}{k+1} \) lines to the standard output. Successive lines should describe successive moves. Each line should contain k+1 integers, in increasing order, separated by single spaces, that denote the numbers of blocks to be removed in the move.</p>

### 힌트

<p>Let &nbsp;denote the empty space after a block that was taken out (the gap). By executing the sequence of moves given above, we obtain the following configurations of blocks, in this order: Wykonując podane powyżej ruchy, uzyskujemy kolejno następujące układy klock&oacute;w:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8240.%E2%80%85Take-out/31826fbd.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8240/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:177px; width:500px" /></p>