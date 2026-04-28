# [Platinum II] Zoo - 17310

[문제 링크](https://www.acmicpc.net/problem/17310)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 82, 정답: 20, 맞힌 사람: 17, 정답 비율: 45.946%

### 분류

자료 구조, KMP, 희소 배열, 문자열

### 문제 설명

<p>Recently, the zookeeper noticed that number of all-eat and no-work animals have been increasing. Take penguins for example &ndash; they only care about getting food from the zoo&#39;s visitors through showing off their cuteness alone. To fix the bad vibe around the zoo and to ensure that animals only get food via exhibiting their true talents, the zookeeper has decided to set up an algorithms class to teach algorithms to the animals.</p>

<p>One day, the zookeeper decided to lecture the KMP algorithm to the animals.</p>

<p>Zookeeper: &quot;For a given string&nbsp;<var>S</var>&nbsp;of length&nbsp;<var>L</var>, we can construct an array next[] in running time O(<var>L</var>). Can anybody guess the meaning of next[]?</p>

<p>Panda: &quot;Within the first&nbsp;<var>i</var>&nbsp;characters of string&nbsp;<var>S</var>, the length of the longest substring (excluding itself) that is both its prefix and suffix will be stored in next[<var>i</var>].&quot;</p>

<p>Zookeeper: &quot;Very good! Can you give an example?&quot;</p>

<p>Panda: &quot;If&nbsp;<var>S</var>&nbsp;=&nbsp;<code>abcababc</code>, then next[5] = 2. This is because the first 5 characters is&nbsp;<code>abcab</code>, and&nbsp;<code>ab</code>&nbsp;is both its prefix and suffix, and a longer substring with this property does not exist. Likewise, we can find that next[1] = next[2] = next[3] = 0, next[4] = next[6] = 1, next[7] = 2, and next[8] = 3.&quot;</p>

<p>The zookeeper commended Panda&#39;s studiousness. Then, he carefully explained how next[] could be computed in O(<var>L</var>).</p>

<p>Before dismissing the class, the zookeeper posed a problem: &quot;The KMP algorithm can only generate the array next[]. We wish to obtain an even more powerful num[] array &ndash; within the first&nbsp;<var>i</var>&nbsp;characters of string&nbsp;<var>S</var>, the number of substrings that is both its prefix and suffix,&nbsp;<b>and that the prefix and suffix does not overlap,</b>&nbsp;will be stored in num[<var>i</var>]. For example, if&nbsp;<var>S</var>&nbsp;=&nbsp;<code>aaaaa</code>, then num[4] = 2. This is because for the first 4 characters of&nbsp;<var>S</var>,&nbsp;<code>aaaa</code>, substrings&nbsp;<code>a</code>&nbsp;and&nbsp;<code>aa</code>&nbsp;each satisfy the conditions of &#39;being both a prefix and suffix,&#39; as well as guaranteeing that the prefix and suffix do not overlap. Although substring&nbsp;<code>aaa</code>&nbsp;does satisfy the condition of &#39;being both a prefix and suffix,&#39; we cannot count it because as simultaneously a prefix and suffix of&nbsp;<code>aaaa</code>, it overlaps with itself. By the same reasoning, we can see that num[1] = 0, num[2] = num[3] = 1, and num[5] = 2.&quot;</p>

<p>Finally, the zookeeper designated a prize. The first student to solve this will be rewarded a box of chocolates. After hearing this, Penguin, who has been sleeping for the entire class, has immediately awoken! But Penguin doesn&#39;t have a clue how to solve this problem. So, he has scoured the entire zoo to find you for help. Can you help Penguin write a program to compute the num[] array?</p>

<p>Specifically, to avoid huge amounts of output, you do not have to output each value of num[<var>i</var>]. Instead, you will only have to output $\prod_{i=1}^{n}{num[i] + 1}$ modulo 1,000,000,007.</p>

### 입력

<p>The first line of input contains a single integer&nbsp;<var>n</var>, representing the number of test cases.</p>

<p>For the next&nbsp;<var>n</var>&nbsp;lines, each line will describe one instance of the problem. Each instance will consist of the single string&nbsp;<var>S</var>. It is guaranteed that&nbsp;<var>S</var>&nbsp;will only consist of lowercase letters.</p>

<p>The input will not contain extra or trailing spaces.</p>

### 출력

<p>The output should contain&nbsp;<var>n</var>&nbsp;lines, with each line being the answer to the corresponding input string. The order of the answers should be the same as the order of the strings in the input. For each string, the answer should be a single integer representing the answer modulo 1,000,000,007.</p>

### 제한

<ul>
	<li>1 &le; n &le; 5</li>
	<li>1 &le; L&nbsp;&le; 1000000</li>
</ul>