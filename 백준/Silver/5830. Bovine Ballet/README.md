# [Silver I] Bovine Ballet - 5830

[문제 링크](https://www.acmicpc.net/problem/5830)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 147, 정답: 73, 맞힌 사람: 67, 정답 비율: 50.000%

### 분류

구현, 기하학, 시뮬레이션

### 문제 설명

<p>In an attempt to challenge the stereotypical perception of cows as awkward creatures, Farmer John&#39;s prize cow Bessie has signed up for an introductory ballet class. Her final performance is next week, and FJ wants to help her by building a rectangular stage large enough so that she can perform her entire dance without falling off the edges.</p>

<p>Bessie&#39;s dance will take place on a rectangular stage consisting of a grid of 1 x 1 square cells. Bessie&#39;s four feet are described concisely as follows:</p>

<ul>
	<li>FR: Front right foot</li>
	<li>FL: Front left foot</li>
	<li>RR: Rear right foot</li>
	<li>RL: Rear left foot</li>
</ul>

<p>Her four feet start out in 4 adjacent cells forming a square as follows, with Bessie facing north.</p>

<pre>
FL FR 
RL RR</pre>

<p>Bessie&#39;s dance follows a series of N instructions (1 &lt;= N &lt;= 1000), where each instruction tells her to either move one foot by one cell or to pivot 90 degrees clockwise.</p>

<p>Instructions to move a foot consist of 3 characters, the first two identifying the foot to move, and the final character specifying the direction of movement (F = forward, B = back, R = right, L = left). For example, &quot;FRF&quot; means Bessie should move her front right foot forward one cell, and &quot;RLR&quot; means she should move her rear left foot right one cell. Of course, the direction of movement is relative to the direction Bessie is facing.</p>

<p>Instruction to pivot are also 3 characters, the first two specifying the single foot that Bessie keeps planted, around which she rotates 90 degrees clockwise. The last character is &quot;P&quot; (for pivot). For example, the instruction &quot;FRP&quot; means Bessie should pivot 90 degrees clockwise about her stationary front right foot. This means that if her feet are currently situated as follows (with Bessie facing north)</p>

<pre>
.. .. .. 
.. .. FR 
.. FL .. 
.. RL RR 
</pre>

<p>then the after the instruction &quot;FRP&quot; her feet will be located as follows, with Bessie now facing east:</p>

<pre>
RL FL .. 
RR .. FR 
.. .. ..  
.. .. .. 
</pre>


<p>Given the N instructions in Bessie&#39;s dance, please compute the minimum area of a rectangular stage necessary contain her feet during the entire dance.</p>

<p>If Bessie clumsily ever moves one foot onto the same cell as another foot, she will trip and fail to complete the dance; in this case, please output -1. Note that this is the only case where Bessie will trip; she has become quite flexible after all her practice, and can easily move her feet into rather strange configurations (for example, with her back feet farther forward than her front feet).</p>

### 입력

<ul>
	<li>Line 1: The integer N.</li>
	<li>Lines 2..1+N: Each line contains one of the 3-character instructions in Bessie&#39;s dance.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The minimum area of a rectangular stage necessary to contain Bessie&#39;s feet during the entire dance, or -1 if Bessie trips.</li>
</ul>

### 힌트

<h4>Input Details</h4>

<p>Bessie&#39;s dance consists of the instructions &quot;front right foot forward&quot;, &quot;front right foot pivot&quot;, and &quot;rear left foot back&quot;.</p>

<h4>Output Details</h4>

<p>Bessie needs a 4 x 4 stage to complete her dance. Her feet move as follows:</p>

<pre>
.. .. .. .. 
.. .. .. .. (facing north)
.. .. FL FR 
.. .. RL RR 
</pre>

<p>After FRF:</p>

<pre>
.. .. .. .. 
.. .. .. FR (facing north)
.. .. FL .. 
.. .. RL RR 
</pre>

<p>After FRP:</p>

<pre>
.. RL FL .. 
.. RR .. FR (facing east)
.. .. .. .. 
.. .. .. .. 
</pre>

<p>After RLB:</p>

<pre>
RL .. FL ..
.. RR .. FR (facing east)
.. .. .. ..
.. .. .. ..
</pre>