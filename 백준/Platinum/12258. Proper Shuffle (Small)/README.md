# [Platinum IV] Proper Shuffle (Small) - 12258

[문제 링크](https://www.acmicpc.net/problem/12258)

### 성능 요약

시간 제한: 60 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 9, 맞힌 사람: 9, 정답 비율: 30.000%

### 분류

수학, 조합론, 확률론, 휴리스틱, 베이즈 정리

### 문제 설명

<p>A <i>permutation</i> of size <b>N</b> is a sequence of <b>N</b> numbers, each between 0 and <b>N</b>-1, where each number appears exactly once. They may appear in any order.</p>

<p>There are many (<b>N</b> <i>factorial</i>, to be precise, but it doesn&#39;t matter in this problem) permutations of size <b>N</b>. Sometimes we just want to pick one at random, and of course we want to pick one at random <i>uniformly</i>: each permutation of size <b>N</b> should have the same probability of being chosen.</p>

<p>Here&#39;s the pseudocode for one of the possible algorithms to achieve that goal (we&#39;ll call it the <i>good</i> algorithm below):</p>

<pre>
<code>for <b>k</b> in 0 .. <b>N</b>-1:
  <b>a</b>[<b>k</b>] = <b>k</b>
for <b>k</b> in 0 .. <b>N</b>-1:
  <b>p</b> = randint(<b>k</b> .. <b>N</b>-1)
  swap(a[<b>k</b>], a[<b>p</b>])</code></pre>

<p>In the above code, <code>randint(<b>a</b> .. <b>b</b>)</code> returns a uniform random integer between <b>a</b> and <b>b</b>, inclusive.</p>

<p>Here&#39;s the same algorithm in words. We start with the <i>identity</i> permutation: all numbers from 0 to <b>N</b>-1 written in increasing order. Then, for each <b>k</b> between 0 and <b>N</b>-1, inclusive, we pick an independent uniform random integer <b>p</b><sub><b>k</b></sub> between <b>k</b> and <b>N</b>-1, inclusive, and swap the element at position <b>k</b> (0-based) in our permutation with the element at position <b>p</b><sub><b>k</b></sub>.</p>

<p>Here&#39;s an example for <b>N</b>=4. We start with the identity permutation:</p>

<p>0 1 2 3</p>

<p>Now <b>k</b>=0, and we pick a random <b>p</b><sub>0</sub> between 0 and 3, inclusive. Let&#39;s say we picked 2. We swap the 0th and 2nd elements, and our permutation becomes:</p>

<p>2 1 0 3</p>

<p>Now <b>k</b>=1, and we pick a random <b>p</b><sub>1</sub> between 1 and 3, inclusive. Let&#39;s say we picked 2 again. We swap the 1st and 2nd elements, and our permutation becomes:</p>

<p>2 0 1 3</p>

<p>Now <b>k</b>=2, and we pick a random <b>p</b><sub>2</sub> between 2 and 3, inclusive. Let&#39;s say we picked 3. We swap the 2nd and 3rd elements, and our permutation becomes:</p>

<p>2 0 3 1</p>

<p>Now <b>k</b>=3, and we pick a random <b>p</b><sub>3</sub> between 3 and 3, inclusive. The only choice is 3. We swap the 3rd and 3rd elements, which means that the permutation doesn&#39;t change:</p>

<p>2 0 3 1</p>

<p>The process ends now, and this is our random permutation.</p>

<p>There are many other algorithms that produce a random permutation uniformly. However, there are also many algorithms to generate a random permutation that look very similar to this algorithm, but are not uniform &mdash; some permutations are more likely to be produced by those algorithms than others.</p>

<p>Here&#39;s one bad algorithm of this type. Take the <i>good</i> algorithm above, but at each step, instead of picking <b>p</b><sub><b>k</b></sub> randomly between <b>k</b> and <b>N</b>-1, inclusive, let&#39;s pick it randomly between 0 and <b>N</b>-1, inclusive. This is such a small change, but now some permutations are more likely to appear than others!</p>

<p>Here&#39;s the pseudocode for this algorithm (we&#39;ll call it the <i>bad</i> algorithm below):</p>

<pre>
<code>for <b>k</b> in 0 .. <b>N</b>-1:
  <b>a</b>[<b>k</b>] = <b>k</b>
for <b>k</b> in 0 .. <b>N</b>-1:
  <b>p</b> = randint(0 .. <b>N</b>-1)
  swap(a[<b>k</b>], a[<b>p</b>])</code></pre>

<p>In each test case, you will be given a permutation that was generated in the following way: first, we choose either the good or the bad algorithm described above, each with probability 50%. Then, we generate a permutation using the chosen algorithm. Can you guess which algorithm was chosen just by looking at the permutation?</p>

<p>This problem is a bit unusual for Code Jam. You will be given <b>T</b> = 120 permutations of <b>N</b> = 1000 numbers each, and should print an answer for each permutation &ndash; this part is as usual. However, you don&#39;t need to get all of the answers correct! Your solution will be considered correct if your answers for at least <b>G</b> = 109 cases are correct. However, you must follow the output format, even for cases in which your answer doesn&#39;t turn out to be correct. The <i>only</i> thing that can be wrong on any case, yet still allow you to be judged correct, is swapping GOOD for BAD or vice versa; but you should still print either GOOD or BAD for each case.</p>

<p>It is guaranteed that the permutations given to you were generated according to the method above, and that they were generated independently of each other.</p>

<p>This problem involves randomness, and thus it might happen that even the best possible solution doesn&#39;t make 109 correct guesses for a certain input, as both the good and the bad algorithms can generate any permutation. Because of that, this problem doesn&#39;t have a Large input, and has just the Small input which you can try again if you think you got unlucky. Note that there is the usual 4-minute penalty for incorrect submissions if you later solve that input, even if the only reason you got it wrong was chance.</p>

<p>In our experience with this problem, that <i>did happen</i> (getting wrong answer just because of chance); so if you are confident that your solution should be working, but it failed, it might be a reasonable strategy to try again with the same solution which failed.</p>

<p>Good luck!</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b> (which will always be 120). Each test case contains two lines: the first line contains the single integer <b>N</b> (which will always be 1000), and the next line contains <b>N</b> space-separated integers - the permutation that was generated using one of the two algorithms.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #<b>x</b>: <b>y</b>&quot;, where <b>x</b> is the test case number (starting from 1) and <b>y</b> is either &quot;GOOD&quot; or &quot;BAD&quot; (without the quotes). You should output &quot;GOOD&quot; if you guess that the permutation was generated by the first algorithm described in the problem statement, and &quot;BAD&quot; if you guess that the permutation was generated by the second algorithm described in the problem statement.</p>

### 제한

<ul>
	<li><b>T</b> = 120</li>
	<li><b>G</b> = 109</li>
	<li><b>N</b> = 1000</li>
	<li>Each number in the permutation will be between 0 and <b>N</b>-1 (inclusive), and each number from 0 to <b>N</b>-1 will appear exactly once in the permutation.</li>
</ul>

### 힌트

<p>The sample input doesn&#39;t follow the limitations from the problem statement - the real input will be much bigger.</p>