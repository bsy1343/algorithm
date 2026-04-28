# [Gold II] Fix the heap 32-bit - 20755

[문제 링크](https://www.acmicpc.net/problem/20755)

### 성능 요약

시간 제한: 13 초, 메모리 제한: 256 MB

### 통계

제출: 31, 정답: 6, 맞힌 사람: 5, 정답 비율: 26.316%

### 분류

애드 혹

### 문제 설명

<p>Petya wrote a heap for dynamic memory allocation in his own programming language Tse. Here is how it works.</p>

<p>A correct heap is a continuous segment of memory consisting of $N$ cells. Each cell contains an unsigned <strong>32-bit</strong> integer, which can have any value <strong>from 0 to </strong>$\mathbf{4\,294\,967\,295}$ inclusive. The heap is split into $B$ sub-segments called blocks. Each of the memory cells belongs to strictly one block.</p>

<p>Each block consists of two or more cells. The first and the last cells of a block contain the effective size of the block, which is the number of cells in it, excluding the first and last cells. The rest of the block&#39;s cells can contain arbitrary data regardless of whether the block is free or occupied.</p>

<p>Tse is a very low-level language, and its users often mess everything up and corrupt the heap by inadvertently writing their data into wrong cell. Users are asking Petya to come up with a feature of recovering heap integrity after such incidents. The recovery code must analyze the contents of $N$ cells of the memory segment where the heap is supposed to be located, and change the contents of several memory cells in such a manner that the segment becomes a correct heap. The number of modified cells must be minimal.</p>

### 입력



### 출력



### 힌트

<p>The example fully repeats the second example from another problem &lt;&lt;Fix the heap 8bit&gt;&gt;: both the contents of the memory cells and the suggested recovery fixes are the same. Illustration:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20755.%E2%80%85Fix%E2%80%85the%E2%80%85heap%E2%80%8532-bit/67cc32c8.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20755.%E2%80%85Fix%E2%80%85the%E2%80%85heap%E2%80%8532-bit/67cc32c8.png" data-original-src="https://upload.acmicpc.net/eb84b44c-7c0d-48f2-a872-d0437d6ca954/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 332px; height: 61px;" /></p>