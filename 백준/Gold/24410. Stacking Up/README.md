# [Gold II] Stacking Up - 24410

[문제 링크](https://www.acmicpc.net/problem/24410)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 27, 맞힌 사람: 24, 정답 비율: 50.000%

### 분류

수학, 해 구성하기

### 문제 설명

<p>Stacy has recently started work at Stacks&ldquo;R&rdquo;Us, a leading manufacturer of stack-related products such as children&rsquo;s blocks, pancake spatulas, and dining hall tray dispensers. As a brand new employee, she has been tasked with testing the latest product in Stacks&ldquo;R&rdquo;Us&rsquo;s line of automated electronic stack machines, the <em>Stackulator 3000</em>.</p>

<p>The Stackulator 3000 holds a single stack of positive integers in its memory, and supports three instructions, <code>1</code>, <code>d</code>, and <code>+</code>. The first two instructions are fairly standard:</p>

<ul>
	<li><code>1</code>: push the number 1 onto the top of the stack.</li>
	<li><code>d</code>: duplicate the number on top of the stack, that is, take the number currently on top of the stack and push another copy of it on top. It is an error to execute the <code>d</code> instruction on an empty stack.</li>
</ul>

<p>Unfortunately, due partly to miscommunication between the designer and the hardware team, and partly to confusion about the difference between a stack <em>pointer</em> and a stack <em>entry</em>, the <code>+</code> instruction ended up being a little wonky:</p>

<ul>
	<li><code>+</code>: pop the top two numbers from the stack, <em>decrement all remaining stack entries by one</em>, then add the two popped elements and push the result onto the stack. It is an error to execute the <code>+</code> instruction on a stack containing fewer than two integers.</li>
</ul>

<p>For example, executing the program <code>1d+11+</code> produces the sequence of stack states illustrated in Figure J.1, ultimately resulting in a stack containing two entries, $1$ on the bottom and $2$ on the top.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/fcf2a302-2a4e-4d53-98b8-47deaeca8c03/-/preview/" style="width: 545px; height: 53px;" /></p>

<p style="text-align: center;">Figure J.1: Execution of <code>1d+11+</code></p>

<p>If a stack entry of $1$ is decremented during an addition operation, it is simply removed from the stack, since the stack can only hold positive integers.</p>

<p>Since she is still an apprentice stack tester, Stacy was assigned to work with Stan, a more experienced tester. Stan proposes that they split the work evenly: Stan will come up with stacks, and it will then be Stacy&rsquo;s job to create Stackulator 3000 programs which should generate the given stacks. They can then run Stacy&rsquo;s programs to ensure the Stackulator 3000 gives the expected results.</p>

<p>Stacy could do this, but she is now too busy looking for a different job. That&rsquo;s where you come in: please help Stacy by creating Stackulator 3000 programs that can generate the stacks given by Stan.</p>

### 입력

<p>The first line of input consists of an integer $1 &le; n &le; 1\,000$. The following line contains $n$ spaceseparated positive integers, indicating the desired contents of the stack from bottom to top. Each integer $x$ will be in the range $1 &le; x &le; 10^6$.</p>

### 출력

<p>Output a single line containing a valid Stackulator 3000 program, which, when executed beginning with an empty stack, results in a stack holding the desired contents. Your program must consist of only the characters <code>1</code>, <code>d</code>, and <code>+</code> and be no more than $100\,000$ characters in length. If there is more than one valid program which results in the desired stack, you may output any of them.</p>