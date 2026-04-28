# [Platinum II] Decoder Ring - 25847

[문제 링크](https://www.acmicpc.net/problem/25847)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>Cereal Companies usually include toys in their boxes to attract kids to their products. One of the toys in the 1990&rsquo;s was as follows: the toy had a piece of paper showing a long string of letters (we will refer to this string as the ciphertext). The toy also had a list of positive integers, which we will refer to as the key. The first integer of the key was the distance from the beginning of the ciphertext to get you to the first letter of a plaintext message, i.e., the first integer would provide how far to advance in the ciphertext to arrive at the first letter of the plaintext message. The second integer of the key was the distance from the first letter in the ciphertext to get you to the second letter of the plaintext message. The third integer of the key was the distance from the second letter in the ciphertext to get you to the third letter in the plaintext message, and so on. Taking the steps provided in the key would reveal the plaintext message. The sum of the integers in the key would not, of course, exceed the length of the ciphertext. For example, if the ciphertext was &ldquo;abcdoefgholijk&rdquo; and the key was {3,2,5,1}, the plaintext message would be &ldquo;cool&rdquo;.</p>

<p>But, the kids today have access to several computing devices so the above problem would be solved in one millisecond by the kids! The Unlimited Cereal Factory has modified the above toy. The new version provides a string and an integer K; the ciphertext is created by repeating (concatenating) the given string K times. The key is not provided either; rather the plaintext message is provided and the challenge is to determine how many different keys could be selected to extract the plaintext message from the ciphertext. Again, the sum of integers cannot exceed the length of the ciphertext.</p>

<p>Let&rsquo;s use the first Sample Input/Output to explain the problem further. The ciphertext is &ldquo;abcde&rdquo; repeated 4 times so the ciphertext is &ldquo;abcdeabcdeabcdeabcde&rdquo;, and the plaintext message is &ldquo;abc&rdquo;. The plaintext message can be extracted from the ciphertext with 20 different keys, each key (list of integers) providing the distances. Some of the 20 possible keys that can be used to extract the plaintext &ldquo;abc&rdquo; from the ciphertext are {1, 1, 1}, {1, 1, 6}, {1, 1, 11}, {1, 1, 16}, and {1, 6, 1}.</p>

<p>Given a ciphertext formed by a string repeated a constant number of times, and a desired plaintext message, determine the number of ways you can create the plaintext message represented by positive offsets on the ciphertext. Since the number of ways can be quite large, output the answer modulo 1,000,000,007.</p>

### 입력

<p>The first input line contains a string (1 &le; length &le; 100), starting in column 1 and consisting of only lowercase letters. The second input line contains an integer, k (1 &le; k &le; 10<sup>18</sup>), representing the number of times the string is repeated to derive the ciphertext. The third input line contains the plaintext message (1 &le; length &le; 50), starting in column 1 and consisting of only lowercase letters.</p>

### 출력

<p>Print a single integer, representing the number of ways to form the plaintext message from the ciphertext. Again, the sum of the integers in the list cannot, of course, exceed the length of the ciphertext.</p>