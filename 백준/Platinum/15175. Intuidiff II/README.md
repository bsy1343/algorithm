# [Platinum IV] Intuidiff II - 15175

[문제 링크](https://www.acmicpc.net/problem/15175)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 18, 맞힌 사람: 18, 정답 비율: 75.000%

### 분류

자료 구조, 다이나믹 프로그래밍, 세그먼트 트리

### 문제 설명

<p>You may recall Intuidiff, the alternative to diff that we asked you to help develop at the Divisionals contest. Intuidiff gives an intuitive way to track changes in two files: the original document and the modified document.</p>

<p>We are now onto the next stage of development of Intuidiff. After some preprocessing, the original document has been broken up into several non-overlapping substrings, and each of these has been assigned a different colour (for example, see the &lsquo;Before&rsquo; paragraph in Figure I.1). Then, in the modified document, the substrings are coloured using the same colours as those in the original document (for example, see the &lsquo;After&rsquo; paragraph in Figure I.1). This allows us to see how large substrings have moved in the document. Substrings with the same colour may appear multiple times in the &lsquo;After&rsquo; section, but only once in the &lsquo;Before&rsquo; section. For example, the substring &ldquo;et dolore magna aliqua.&rdquo; appears twice in the modified document of Figure I.1.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15175/1.png" style="height:109px; width:381px" /></p>

<p style="text-align:center">Figure I.1: A full colouring from the Intuidiff program.</p>

<p>While pretty, this full colouring might be overwhelming for some users. Also, it is distracting if every character is highlighted in the modified document. Attention should be focused only on the changes.</p>

<p>Therefore, for the next stage of development of Intuidiff, we must select which substrings to highlight. A full colouring of the document has already been decided on. We must select substrings from the full colouring in such a way that the non-highlighted characters are in the same order as in the original document.</p>

<p>The characters that are not highlighted must be in the same order as in the original document. The selection of substrings is done in such a way that the number of non-highlighted characters in the modified document is maximised (for example, see Figure I.2).</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15175/2.png" style="height:114px; width:381px" /></p>

<p style="text-align:center">Figure I.2: A desired colouring from the Intuidiff program.</p>

### 입력

<p>The first line of input contains a single integer n (1 &le; n &le; 100 000), which is the number of coloured substrings in the full colouring in the modified document. The next n lines describe the coloured substrings in the modified document. Each of these lines contain two integers a and b (0 &le; a &le; b &le; 10<sup>9</sup>), which is the substring of the original document running from the character at index a to the character at index b, inclusive.</p>

<p>No two substrings will partially overlap. That is, if two substrings share any common indices, then the substrings will be identical.</p>

### 출력

<p>Display the number of characters that are not highlighted by Intuidiff in the modified document.</p>

### 힌트

<p>Sample Input 1 is the &lsquo;After&rsquo; paragraph from Figure I.1. The 154 non-highlighted characters are shown in Figure I.2.</p>