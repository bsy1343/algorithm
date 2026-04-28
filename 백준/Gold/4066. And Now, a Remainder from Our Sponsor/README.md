# [Gold III] And Now, a Remainder from Our Sponsor - 4066

[문제 링크](https://www.acmicpc.net/problem/4066)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 20, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

브루트포스 알고리즘, 구현, 문자열

### 문제 설명

<p>IBM has decided that all messages sent to and from teams competing in the ACM programming contest should be encoded. They have decided that instead of sending the letters of a message, they will transmit their remainders relative to some secret keys which are four, two-digit integers that are pairwise relatively prime. For example, consider the message &quot;THE CAT IN THE HAT&quot;. The letters of this message are first converted into numeric equivalents, where A=01, B=02, ..., Z=26 and a blank=27. Each group of 3 letters is then combined to create a 6 digit number. (If the last group does not contain 3 letters it is padded on the right with blanks and then transformed into a 6 digit number.) For example</p>

<p>THE CAT IN THE HAT &rarr; 200805 270301 202709 142720 080527 080120</p>

<p>Each six-digit integer is then encoded by replacing it with the remainders modulo the secret keys as follows: Each remainder should be padded with leading 0&rsquo;s, if necessary, to make it two digits long. After this, the remainders are concatenated together and then any leading 0&rsquo;s are removed. For example, if the secret keys are 34, 81, 65, and 43, then the first integer 200805 would have remainders 1, 6, 20 and 38. Following the rules above, these combine to get the encoding 1062038. The entire sample message above would be encoded as</p>

<p>1062038 1043103 1473907 22794503 15135731 16114011</p>

### 입력

<p>The input consists of multiple test cases. The first line of input consists of a single positive integer n indicating the number of test cases. The next 2n lines of the input consist of the test cases. The first line of each test case contains a positive integer (&lt; 50) giving the number of groups in the encoded message. The second line of each test case consists of the four keys followed by the encoded message. Each message group is separated with a space.</p>

### 출력

<p>For each test case write the decoded message. You should not print any trailing blanks.</p>