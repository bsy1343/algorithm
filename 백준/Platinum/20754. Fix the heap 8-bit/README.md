# [Platinum III] Fix the heap 8-bit - 20754

[문제 링크](https://www.acmicpc.net/problem/20754)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 46, 정답: 8, 맞힌 사람: 2, 정답 비율: 10.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭

### 문제 설명

<p>Petya wrote a heap for dynamic memory allocation in his own programming language Tse. Here is how it works.</p>

<p>A correct heap is a continuous segment of memory consisting of $N$ cells. Each cell contains an unsigned <strong>8-bit</strong> integer, which can have any value <strong>from 0 to 255</strong> inclusive. The heap is split into $B$ sub-segments called blocks. Each of the memory cells belongs to strictly one block.</p>

<p>Each block consists of two or more cells. The first and the last cells of a block contain the effective size of the block, which is the number of cells in it, excluding the first and last cells. The rest of the block&#39;s cells can contain arbitrary data regardless of whether the block is free or occupied.</p>

<p>Tse is a very low-level language, and its users often mess everything up and corrupt the heap by inadvertently writing their data into wrong cell. Users are asking Petya to come up with a feature of recovering heap integrity after such incidents. The recovery code must analyze the contents of $N$ cells of the memory segment where the heap is supposed to be located, and change the contents of several memory cells in such a manner that the segment becomes a correct heap. The number of modified cells must be minimal.</p>

### 입력

<p>The contents of $N$ memory cells comprising the analyzed memory segment are provided in a binary file of size $N$ bytes. Each byte of the file represents a single memory cell. $2 \le N \le 2^{24}$ holds true, meaning that the size of the file is not less than two bytes and not greater than 16 megabytes.</p>

### 출력

<p>Write the found set of $K$ cell changes into a binary file of size $4 K$ bytes.</p>

<p>Each change is described by four bytes. The first three bytes are treated as an unsigned 24-bit integer and define the address (index) of the modified cell. Naturally, this number must be smaller than $N$ --- the size of the input file. The last, fourth byte defines the new contents of the cell.</p>

<p>24-bit addresses must be written in little-endian byte order, with the first byte being the least significant one and the last byte being the most significant one. If there are several answers with the same number of changes, you can write any of them. The order of describing cell changes in the output file is irrelevant.</p>

### 힌트

<p>For convenience, the contents of the input and the output files are shown above in hex format. In the testing system, the files will be in binary! You can download samples in binary format <a href="https://upload.acmicpc.net/8a373e87-c92b-47f4-8bbf-2987c594c1c6/">sample-1.bin</a>, <a href="https://upload.acmicpc.net/8e53fd62-466c-4210-bd3a-8dfa1a8aed72/">sample-2.bin</a>.</p>

<p>For fast file reading it is recommended to use one call of: <code>Files.readAllBytes</code> on Java and <code>fread</code> on C++. Don&#39;t forget that files should be opened in binary mode on C++.</p>

<p>In both examples $N = 11$. In the first example the heap is already correct, containing three blocks with effective sizes 2, 0, and 3, respectively. Since no changes are necessary, the output file must be empty. In the second example, the heap is incorrect, but it can be fixed with two changes, by turning it exactly into the heap from the first example. For this purpose, it is suggested that the cell with the address 3 be changed from <code>CC</code> to <code>02</code>, and the cell with the address 5 be changed from <code>DD</code> to <code>00</code>.</p>

<p>Illustration for the second example (integers displayed in decimal format):</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/be770155-539b-4926-b1f6-f10fa6a4f692/-/preview/" style="width: 332px; height: 61px;" /></p>