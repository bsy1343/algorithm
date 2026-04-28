# [Platinum I] decrypt - 16476

[문제 링크](https://www.acmicpc.net/problem/16476)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 111, 정답: 32, 맞힌 사람: 18, 정답 비율: 19.355%

### 분류

수학, 그래프 이론, 무작위화

### 문제 설명

<p>There is a rumor that the Scientific Committee is using a special device for encrypting their communication. If you can crack the encryption you could listen to the problems they have prepared and score many points. Last night you got lucky: one of the members forgot their device in a bar. You opened it and looked at the general design:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16476.%E2%80%85decrypt/8b9f6afb.png" data-original-src="https://upload.acmicpc.net/dd440796-2792-4657-9a7e-d2e672599ad3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 204px; height: 114px; float: right;" />All the operations use 8 bits. XOR is the bitwise exclusive or function (the ^ operator in C, xor operator in Pascal).</p>

<p>R is a sequence of pseudorandom numbers defined as follows:</p>

<ul>
	<li>R[0], R[1] and R[2] have secret values only known by the Scientific Committee.</li>
	<li>For n = 3,4,&hellip; let R[n] = R[n-2] XOR R[n-3].</li>
</ul>

<p>Furthermore, we have a function M, M:[0..255] &rarr;[0..255]. In fact, M is a bijection, i.e. when x&ne;y it must also be that M[x]&ne;M[y].</p>

<p>The device used by the Scientific Committee takes one number at a time, and outputs it encrypted.</p>

<p>After using the device N times, the next number, INPUT is encoded as follows:</p>

<ul>
	<li>OUTPUT = M(INPUT XOR R[N])</li>
</ul>

<p>Even though you understand how the encryption device works, you do not know the secret values R[0], R[1], and R[2]. Also, you do not know M, so you cannot decode the communication. What you can do instead is play with the device you found. You can give it input numbers and observe the outputs.</p>

<p>Your task is to find out all the secret values: R[0], R[1], R[2], M[0], M[1], .., M[255] with less than 320 queries (input numbers).</p>

### 입력



### 출력



### 제한

<ul>
	<li>A correct solution receives points only if the number of queries is less than 320.</li>
	<li>In all tests the secret keys R[0], R[1], R[2], M[0], M[1], &hellip;, M[255] are random.</li>
	<li>0 &le; INPUT, OUTPUT, R, M &le; 255</li>
</ul>