# [Platinum III] Spinning Up Palindromes - 15114

[문제 링크](https://www.acmicpc.net/problem/15114)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 12, 맞힌 사람: 10, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15114.%E2%80%85Spinning%E2%80%85Up%E2%80%85Palindromes/6ed63c57.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15114.%E2%80%85Spinning%E2%80%85Up%E2%80%85Palindromes/6ed63c57.png" data-original-src="https://upload.acmicpc.net/d0aa85d1-646b-42f0-908b-c45d459b98ee/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 247px; height: 100px;" /></p>

<p>&quot;Sabotage!&quot; exclaimed J.R. Diddly, president and founder of Diddly Widgets Inc.</p>

<p>&quot;Vandalism, perhaps. Nothing&#39;s actually been damaged.&quot; responded Robert Lackey, the chief accountant.</p>

<p>Both were staring up at the large counter suspended above the factory floor, a counter that had faithfully recorded the number of widgets that had come off the assembly line since the factory was opened. But someone had changed the number being displayed so that it formed...</p>

<p>&quot;It&#39;s a palindrome.&quot; said Lackey. &quot;It reads the same forwards as backwards.&quot;</p>

<p>&quot;What I don&#39;t understand,&quot; said Diddly, &quot;is why our security guards didn&#39;t catch the vandals during their regular sweeps. It must have taken them hours to click forward to this new number, one step at a time.&quot;</p>

<p>&quot;No.&quot; replied Lackey. &quot;Although we only advance the rightmost digit each time a new widget is built, it&#39;s possible to spin any of the digits. With a little planning, this might have taken only a few seconds.&quot;</p>

<p>Consider a digital counter consisting of $k$ wheels, each showing a digit from <code>0</code> to <code>9</code>. Each wheel is mounted so that it can advance to the next digit in a single step, <em>e.g.</em>, from <code>3</code> to <code>4</code>, or from <code>8</code> to <code>9</code>.</p>

<p>It is also possible to advance from digit <code>9</code> to digit <code>0</code>. However, when this happens, the wheel on its immediate left will also advance to the next digit automatically. This can have a cascade effect on multiple wheels to the left, but they all happen in a single step.</p>

<p>Given the current setting of the counter, find the smallest number of steps until one can reach a palindrome. The palindrome must respect leading zeros, <em>e.g.</em>, <code>0011</code> is not a palindrome.</p>

<p>For example, for input <code>610</code>, it takes four steps. This can be done by incrementing the <code>6</code> wheel four times, resulting in <code>010</code>.</p>

### 입력

<p>Input will consist of single line containing an integer of $1$ to $40$ digits.   The number of digits in the input is the number of wheels on the counter.   Numbers may contain leading zeros.</p>

### 출력

<p>Print a single line of output containing one integer, the minimum number of wheel advances required to produce a palindrome.</p>