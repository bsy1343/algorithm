# [Platinum II] Palindromes - 8136

[문제 링크](https://www.acmicpc.net/problem/8136)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 236, 정답: 49, 맞힌 사람: 34, 정답 비율: 20.732%

### 분류

자료 구조, KMP, 문자열

### 문제 설명

<p>Little Johnny enjoys playing with words. He has chosen n palindromes (a palindrome is a word that reads the same when the letters composing it are taken in the reverse order, such as dad, eye or racecar for instance) then generated all n<sup>2 </sup>possible pairs of them and concatenated the pairs into single words. Lastly, he counted how many of the so generated words are palindromes themselves. However, Johnny cannot be certain of not having comitted a mistake, so he has asked you to repeat the very same actions and to give him the outcome. Write a programme which shall perform this task for you.</p>

<p>
Write a programme which:</p>

<ul>
	<li>reads the palindromes given by Johnny from the standard input,</li>
	<li>determines the number of words formed out of pairs of palindromes from the input, which are palindromes themselves,</li>
	<li>writes the outcome to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains a single integer n, n &ge; 2, denoting the number of palindromes given by Johnny. The following n lines contain a description of the palindromes. The (i+1)&rsquo;st line contains a single positive integer a<sub>i</sub> denoting the length of i&rsquo;th palindrome and a palindrome of ai small letters of English alphabet. The number a<sub>i</sub> is separated from the palindrome by a single space. The palindromes in distinct lines are distinct. The total length of all palindromes does not exceed 2,000,000.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer: the number of distinct ordered pairs of palindromes which form a palindrome upon being concatenated.</p>