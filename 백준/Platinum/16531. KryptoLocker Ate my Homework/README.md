# [Platinum II] KryptoLocker Ate my Homework - 16531

[문제 링크](https://www.acmicpc.net/problem/16531)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 103, 정답: 26, 맞힌 사람: 23, 정답 비율: 27.711%

### 분류

비트마스킹, 해 구성하기, 재귀, 정렬

### 문제 설명

<p>Your friend&rsquo;s computer was infected by KryptoLocker last night. KryptoLocker is a ransomware that encrypts user&rsquo;s data making it unusable until a ransom is paid to the person behind the attack.</p>

<p>Luckily your friend noticed there was something weird happening and was able to stop the malicious process before all data was lost. Unfortunately it didn&rsquo;t happen in time to save the homework he had just finished.</p>

<p>&ldquo;The dog ate my homework&rdquo; never really worked as an excuse for most teachers and probably things won&rsquo;t be different with &ldquo;KryptoLocker encrypted my homework&rdquo;.</p>

<p>But not all hope is lost. For this homework each student was assigned an array of integer numbers v<sub>1</sub> &le; v<sub>2</sub> &le; &middot; &middot; &middot; &le; v<sub>N</sub>. Then, each student had to generate a list of 2<sup>N</sup> numbers, containing the sums of the elements in each possible subsequence of the array. KryptoLocker only corrupted the first line of the file containing your friend&rsquo;s answer and this was the line where the array was written. So, all sums are still known and that should be enough to recover the array.</p>

<p>Can you help your friend save his homework?</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 18) indicating the number of elements in the array assigned to your friend. Each of the next 2<sup>N</sup> lines contains an integer S (&minus;10<sup>9</sup> &le; S &le; 10<sup>9</sup>) representing the sum of the elements in a subsequence of the array. The sums of all possible subsequences appear in the input, in no particular order. There is at least one array whose sums are the values given.</p>

### 출력

<p>Output each different array that may have been assigned to your friend, one array per line, with the lines lexicographically sorted. Two arrays are considered different if, and only if, they contain different elements in at least one position.</p>