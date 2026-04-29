# [Platinum III] BitBitJump - 33028

[문제 링크](https://www.acmicpc.net/problem/33028)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 28, 정답: 18, 맞힌 사람: 18, 정답 비율: 64.286%

### 분류

구현, 많은 조건 분기, 애드 혹, 해 구성하기

### 문제 설명

<p>BitBitJump is a one instruction set computer. Thus, it has only one instruction: <code>bbj a, b, c</code>, which copies an $a$-th bit of memory to the $b$-th bit of memory and then jumps to address $c$.</p>

<p>Let's consider a 16-bit BitBitJump computer. It has $2^{16}$ bits of memory organized in $2^{12}$ 16-bit words. Words are counted from 0, and bits in a word are counted from the least significant (0-th) bit to the most significant (15-th) bit.</p>

<p>This computer has a single instruction pointer register $(\mathrm{IP})$, and execution starts with $\mathrm{IP}=0$. If the current $\mathrm{IP} \ge 2^{12}-2$, the computer stops. Otherwise, it uses the $\mathrm{IP}$-th word as $a$, the $(\mathrm{IP}+1)$-th word as $b$, the $(\mathrm{IP}+2)$-th word as $c$, and performs the <code>bbj a, b, c</code> instruction: copies the $(a \mathbin{\&amp;} 15)$-th bit of the $(a \gg 4)$-th word to the $(b \mathbin{\&amp;} 15)$-th bit of the $(b \gg 4)$-th word, and sets $\mathrm{IP}=c$. Here, '$\mathbin{\&amp;}$' represents bitwise AND, and '$\gg$' represents bitwise shift right operation. Notice that the value of $c$ is read from memory after the bit copy, so if the instruction modified its own $c$, the new value will be used for $\mathrm{IP}$.</p>

<p>For example, the <code>bbj 32, 35, 5</code> instruction placed at the memory start will be executed as follows:</p>

<ol>
	<li>$a=32$ and $b=35$ are read from the memory.</li>
	<li>The 0-th bit of the 2-nd word (its value is $5 \mathbin{\&amp;} 1 = 1$) will be copied to the 3-rd bit of the same word, so the 2-nd word will have the value of $5 + 2^3 = 13$.</li>
	<li>Then $c=13$ is read from memory, and $\mathrm{IP}$ is set to 13.</li>
</ol>

<p>Let's call the $(2^{12}-1)$-th word ($2^{16}-16 \ldots 2^{16}-1$-th bits of memory) an <em>IO-word</em>. An <em>$x$-comparator</em> is a program which checks whether the value of the IO-word is equal to $x$. It should stop after execution of no more than $2^{12}$ instructions, leaving the lowest bit of the IO-word equal to $1$ if the original value of the IO-word was equal to $x$, and $0$ otherwise.</p>

<p>Write a program that generates an $x$-comparator for the given value of $x$.</p>

### 입력

<p>The input contains a single decimal integer $x$ ($0 \le x &lt; 2^{16}$) --- the value for which to build the $x$\nobreakdash-comparator.</p>

### 출력

<p>The output should contain the $x$-comparator program dump. Dump consists of values for the first $n$ words of the memory ($1 \le n \le 2^{12}-1$). All other words, except the IO-word, are filled with zeroes.</p>

<p>For each of the $n$ words, output its value as a four-character hexadecimal number. Values should be delimited by space or new line characters.</p>

### 힌트

<p>A dump in the sample output contains a 0-comparator. It consists of the following blocks:</p>

<ul>
	<li>16 instructions: the $i$-th of them, counting from 0, copies the $i$-th bit of the input word to the 6-th bit of its own $c$. If the copied bit is zero, it will proceed to the next instruction; otherwise, the next instruction number will be increased by 64.</li>
	<li>The following instruction copies the 4-th bit of the 0-th word (value 1) to the 0-th bit of the IO-word and jumps to the stop address.</li>
	<li>16 unused words filled with 0.</li>
	<li>16 equal instructions (starting from word 67). Each of them copies the 0-th bit of the 0-th word (value 0) to the 0-th bit of the IO-word and jumps to the stop address.</li>
</ul>