# [Gold V] Balanced Strings - 25937

[문제 링크](https://www.acmicpc.net/problem/25937)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 19, 맞힌 사람: 18, 정답 비율: 62.069%

### 분류

애드 혹, 구현, 문자열

### 문제 설명

<p>Being an individual obsessed with balancing and trying to find strings that meet that criteria, you have begun a new endeavor to study the curious structure of what we will call balanced strings.</p>

<p>Balanced strings are strings that maintain an equal ratio of consonants to vowels in all of their substrings. What? You don&rsquo;t know the difference between a consonant and a vowel? Vowels are the characters &lsquo;a&rsquo;, &lsquo;e&rsquo;, &lsquo;i&rsquo;, &lsquo;o&rsquo;, &lsquo;u&rsquo; and sometimes &lsquo;y&rsquo;. Actually, you don&rsquo;t like the character &lsquo;y&rsquo; because this makes the problem much harder. What was the difficulty level of this problem again? Oh yeah Medium! We can&rsquo;t have a problem about consonants and vowels that makes &lsquo;y&rsquo; sometimes a vowel! That would make the problem a Hard and too many hard problems is a very bad thing. Being obsessed with balance, you have decided that &lsquo;y&rsquo; will be included with the vowels. That way, there are 6 vowels and 20 consonants. A nice balanced even number of both! Oh! I almost forgot! A consonant is any letter that is not a vowel. Also to simplify things (this is a medium problem after all!), we will consider strings composed of lowercase letters only.</p>

<p>Now you are ready to understand balanced strings! A balanced string is a string that has an equal number of consonants and vowels in all of its substrings. Well&hellip; not all of its substrings. Just the substrings of even length! For example, the string &ldquo;orooji&rdquo; has the following set of evenlength substrings: {&ldquo;or&rdquo;, &ldquo;ro&rdquo;, &ldquo;oo&rdquo;, &ldquo;oj&rdquo;, &ldquo;ji&rdquo;, &ldquo;oroo&rdquo;, &ldquo;rooj&rdquo;, &ldquo;ooji&rdquo;, &ldquo;orooji&rdquo;}. In that set the following substrings are unbalanced: {&ldquo;oo&rdquo;, &ldquo;oroo&rdquo;, &ldquo;ooji&rdquo;, &ldquo;orooji&rdquo;}. That is, the substrings do not contain an equal number of vowels and consonants. So, the string &ldquo;orooji&rdquo; is not balanced. But a string like &ldquo;arup&rdquo; is balanced. The requisite even-length substrings are: {&ldquo;ar&rdquo;, &ldquo;ru&rdquo;, &ldquo;up&rdquo;, &ldquo;arup&rdquo;} and all these substrings are balanced (have the same number of vowels and consonants), thus the string &ldquo;arup&rdquo; is balanced. Note that a balanced string may contain an odd number of characters, e.g., the string &ldquo;ali&rdquo; is balanced since all its even-length substrings ({&ldquo;al&rdquo;, &ldquo;li&rdquo;}) are balanced.</p>

<p>Now you want to take words and erase some of the letters and replace them with new letters to form balanced strings. Since this is a medium problem, we&rsquo;ve taken the liberty of erasing some of the letters for you and replaced them with &lsquo;?&rsquo; characters. See! The problem is already halfway solved!</p>

<p>Given a string of lowercase letters and &lsquo;?&rsquo; characters, count the number of ways to replace all the &lsquo;?&rsquo; with lowercase letters such that the string results in a balanced string. Two ways are considered different if there exists some i such that the i th character in one string differs from the i th character of the other string. Note that all the &lsquo;?&rsquo; do not have to be replaced by the same letter.</p>

### 입력

<p>The first input line contains a positive integer, n, indicating the number of strings to balance. The strings are on the following n input lines, one string per line. Each string contains only lowercase letters and/or &lsquo;?&rsquo; characters. Assume each input string has at least one character and at most 100 characters.</p>

### 출력

<p>For each string, output &ldquo;String #d: v&rdquo; where v is the number of ways to replace the questions marks with lower case letters. It is guaranteed that v will fit in a signed 64-bit integer for the strings we provide. Leave a blank line after the output for each string.</p>

### 힌트

<p>The first and last strings in Sample Input do not have any &lsquo;?&rsquo;. The first input is not balanced so there is no way of replacing all &lsquo;?&rsquo; to make it balanced, thus the output is zero. However, the last input is balanced so there is one way of replacing all &lsquo;?&rsquo; to make it balanced, thus the output is 1.</p>