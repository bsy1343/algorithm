# [Platinum III] Alakazam - 18619

[문제 링크](https://www.acmicpc.net/problem/18619)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 79, 정답: 47, 맞힌 사람: 44, 정답 비율: 62.857%

### 분류

수학, 자료 구조, 세그먼트 트리, 확률론, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Hello, fellow Pok&acute;emon trainer! So you&rsquo;re on a safari as well? It&rsquo;s nice you&rsquo;re here, you were the one to spot an Alakazam colony!</p>

<p>The colony consists of n Alakazam specimens. Each of them holds a number of spoons increasing their psychic abilities. They&rsquo;ve just formed up in a line in order to perform a psychic training. It&rsquo;s not just any kind of training &mdash; it&rsquo;s the teleportation training!</p>

<p>The training consists of a number of group teleportations. During each teleportation, a contiguous group of Alakazam specimens disappear and then materialize in the same positions as before, but in a totally random order.</p>

<p>Just before the training, you counted the spoons held by each Alakazam. However, after the training started, you were too far away to count the spoons &mdash; you only saw the teleportations. Basing on your observations, can you predict how many spoons are held by Alakazam at some positions in the line throughout the training? Obviously, as the process is random, we&rsquo;re only asking you about the expected number of spoons.</p>

### 입력

<p>The first line contains two integers n, q (1 &le; n &le; 250 000, 1 &le; q &le; 250 000) &mdash; the number of Alakazam in the line and the number of actions during the training. The following line contains n integers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; 10<sup>6</sup>) &mdash; the number of spoons held by each specimen in the line.</p>

<p>Each of the next q lines describes a single action and is in one of the following formats:</p>

<ul>
	<li>shuffle l r (1 &le; l &le; r &le; n) &mdash; the group of Alakazam between the l-th and the r-th specimen (inclusive) teleport and materialize in random order.</li>
	<li>get i (1 &le; i &le; n) &mdash; you need to predict the expected number of spoons held by the i-th Alakazam in the line.</li>
</ul>

<p>There will be at least one get query in the file.</p>

### 출력

<p>For each get query, output a single decimal number: the expected number of spoons held by the specified Alakazam.</p>

<p>Your answer will be considered correct if its absolute or relative error doesn&rsquo;t exceed 10<sup>&minus;9</sup>.</p>

### 힌트

<p>Before the teleportations, Alakazam hold 1, 2 and 3 spoons:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18619.%E2%80%85Alakazam/c9145952.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/18619.%E2%80%85Alakazam/c9145952.png" data-original-src="https://upload.acmicpc.net/6b505036-b85e-474b-a9a1-4958a3159b24/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 809px; height: 250px;" /></p>

<p>After the first teleportation, two permutations of Alakazam are equally probable: (1, 2, 3) and (2, 1, 3). Meanwhile, after both teleportations, the following permutations are equally probable: (1, 2, 3), (1, 3, 2), (2, 1, 3), (2, 3, 1).</p>