# [Silver I] Harmonics with Interference - 32439

[문제 링크](https://www.acmicpc.net/problem/32439)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 33, 맞힌 사람: 23, 정답 비율: 53.488%

### 분류

백트래킹, 브루트포스 알고리즘

### 문제 설명

<p>The transmission of messages by electromagnetic means presents several challenges, such as interference from other natural or artificial signals that can corrupt a transmission.</p>

<p>A common strategy is to send additional information that allows a received message to be validated. Some more robust protocols even allow for the correction of some errors in the sent message.</p>

<p>Arthur and Bruna are testing a new transmission protocol on a device they have developed. A message $M$, which is a sequence of bits, is sent from Arthur to Bruna, along with a control sequence $N$, also represented as a sequence of bits. By composing the message $M$ and choosing the bits from $N$, Arthur ensures that the integer encoded by $M$ is divisible by the integer represented by $N$.</p>

<p>For each bit received by Bruna, if the bit was transmitted without problems, the value <code>0</code> or <code>1</code> will be stored in the receiving device. If there was any interference, the symbol <code>*</code> is stored in place of the bit. The result of the transmission will be stored in the pair $(M' , N' )$.</p>

<p>After the communication, if the message was sent successfully, Bruna can decode the original message $M$ (since $M = M'$). If there was a problem, due to the way the protocol works, it may still be possible to decode the message. If many bits were lost, Bruna simply discards the message. But for transmissions where at most $16$ bits of the original pair $(M, N)$ were lost, Bruna would like to try to recover the message, avoiding retransmissions. She needs your help to recover one of the possible messages encoded by the received pair $(M' , N' )$.</p>

<p>For example, suppose Bruna received $M'=$<code>111*</code> and $N'=$<code>1*</code>. Two transmissions could have been made:</p>

<ol>
	<li>$M=$<code>1111</code> with $N=$<code>11</code>. In this case, the numbers $15$ and $3$ are represented by $M$ and $N$, respectively.</li>
	<li>$M=$<code>1110</code> with $N=$<code>10</code>. In this case, the numbers $14$ and $2$ are represented by $M$ and $N$, respectively.</li>
</ol>

<p>Your task is: given the representations of the information received, find a message $M$ that could have been sent by Arthur. If more than one message exists, you can print any message that could have been transmitted by Arthur.</p>

### 입력

<p>The first line of input will contain a sequence of characters representing $M'$, with $1 ≤ |M' | ≤ 500$. The second line of input will contain a sequence of characters representing $N'$, with $1 ≤ |N' | ≤ 16$. All characters in $N'$ and $M'$ will be either <code>0</code>, <code>1</code>, or <code>*</code>. In total, there will never be more than $16$ <code>*</code> characters in the input. It is guaranteed that $N'$ always contains at least one bit $1$.</p>

### 출력

<p>A single line should be printed, containing a message $M$, compatible with the information received by Bruna.</p>