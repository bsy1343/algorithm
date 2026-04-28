# [Gold V] Guessing Game II - 6999

[문제 링크](https://www.acmicpc.net/problem/6999)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 54, 정답: 11, 맞힌 사람: 9, 정답 비율: 28.125%

### 분류

브루트포스 알고리즘, 자료 구조, 해시를 사용한 집합과 맵, 휴리스틱, 구현, 집합과 맵

### 문제 설명

<p>While Bilbo has been developing a strategy for guessing the secret to the West gate of Puzzlia, Bombur the dwarf is getting antsy, and thinking &ldquo;how hard can it be&rdquo;, stands up in front of the door, and starts making guesses at random. Before anyone can stop him, he has already made 8 guesses (unsuccessfully as you might expect). Dwalin was able to write down some of the guesses (but not all) and the gate&rsquo;s responses to those guesses. For example, if the guess was 1234, and the gate&rsquo;s response was to light 1 circle, Dwalin recorded it as: &lt;1234 : 1 Circle&gt;</p>

<p>Since the 10th guess must be the correct one, there is now only one guess that can be made with which to find more information about the secret number. Bilbo would like your help in that. Specifically, given up to 8 guess-response pairs, you are to first decide if there is already sucient information to identify the secret correctly. If yes, you are to output the secret. However, if not: you are also to decide whether you can use the remaining guess to elicit sucient information to identify the secret.</p>

<p>For example, if Dwalin had only recorded one guess-response pair, say &lt;1234 : 1 Circle&gt;, there are too many possibilities left to be able to identify the correct secret with just one more guess. On the other hand, given the guess-response pairs: &lt;5888 : 3 Circles&gt;, &lt;1234 : &gt;, &lt;4567 : &gt;, we can deduce that there are only three possibilities for the secret word: 0888, 8888, and 9888. There are several guesses that can uniquely identify the secret. For example, if we were to guess 0988 next, we will get different answers depending upon the secret. If the secret were 0888, we would get &lt;0988 : 3 circles&gt;, but for the other two, we would get: &lt;0988 : 2 circles&gt;, and &lt;0988 : 2 circles, 1 square&gt; respectively. Thus, the response of the gate would enable us to identify the secret. Note that, none of the remaining possibilities are good guesses in this situation: if we were to guess 0888, and if the gate&rsquo;s response were 3 circles, we wouldn&rsquo;t know the secret..</p>

<p>There are several other guesses that can uniquely identify the secret, e.g., 0898, 0889, 0009. In such cases, you should output the one that is numerically the smallest. In this case, the output should be 0009.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&le; 1000). After that, each line contains one test case: the first number is the number of guess-response pairs recorded, n (0 &lt; n &le; 8), and the next 3n numbers denote the triples: &lt;guess, num circles, num squares&gt;. Note that the guesses are implicitly padded with 0&rsquo;s. For example, if one of the guesses is 1, it needs to be treated as 0001.</p>

### 출력

<p>For each test case, you need to distinguish between three cases: the given guess-response pairs are sucient to deduce the secret correctly (CASE SUFFICIENT TO GUESS SECRET), there is one more guess that can uniquely identify the secret (CASE ONE ADDITIONAL GUESS SUFFICIENT), or there is not sucient information to find the secret with one more guess (CASE INSUFFICIENT INFORMATION). In the first and second cases, the secret and the guess should be output respectively. If there are multiple choices for the guess, you should output the one that is numerically the first. Exact format shown below.</p>