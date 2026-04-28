# [Platinum III] 다섯 제곱수의 합 - 28383

[문제 링크](https://www.acmicpc.net/problem/28383)

### 성능 요약

시간 제한: 5.555 초, 메모리 제한: 555 MB

### 통계

제출: 281, 정답: 96, 맞힌 사람: 56, 정답 비율: 33.136%

### 분류

수학, 정수론, 소수 판정, 소인수분해, 폴라드 로, 밀러–라빈 소수 판별법

### 문제 설명

<p>제곱수를 가지고 놀던 상근이는 음이 아닌 정수 $n$을 네 제곱수의 합으로 나타내는 경우의 수보다 다섯 제곱수의 합으로 나타내는 경우의 수가 훨씬 더 많다는 것을 깨달았다.</p>

<p>예를 들어, $n = 1$일 때 네 제곱수의 합으로 나타내는 경우는</p>

<p>$$ \begin{align*} 1 &amp;= 1^2 + 0^2 + 0^2 + 0^2 \\  1 &amp;= {(-1)}^2 + 0^2 + 0^2 + 0^2 \\ 1 &amp;= 0^2 + 1^2 + 0^2 + 0^2 \\  1 &amp;= 0^2 + {(-1)}^2 + 0^2 + 0^2 \\ 1 &amp;= 0^2 + 0^2 + 1^2 + 0^2 \\ 1 &amp;= 0^2 + 0^2 + {(-1)}^2 + 0^2 \\ 1 &amp;= 0^2 + 0^2 + 0^2 + 1^2 \\ 1 &amp;= 0^2 + 0^2 + 0^2 + {(-1)}^2 \end{align*} $$</p>

<p>으로 총 $8$가지고, 다섯 제곱수의 합으로 나타내는 경우는</p>

<p>$$ \begin{align*} 1 &amp;= 1^2 + 0^2 + 0^2 + 0^2 + 0^2 \\ 1 &amp;= {(-1)}^2 + 0^2 + 0^2 + 0^2 + 0^2 \\ 1 &amp;= 0^2 + 1^2 + 0^2 + 0^2 + 0^2 \\ 1 &amp;= 0^2 + {(-1)}^2 + 0^2 + 0^2 + 0^2 \\ 1 &amp;= 0^2 + 0^2 + 1^2 + 0^2 + 0^2 \\ 1 &amp;= 0^2 + 0^2 + {(-1)}^2 + 0^2 + 0^2 \\ 1 &amp;= 0^2 + 0^2 + 0^2 + 1^2 + 0^2 \\ 1 &amp;= 0^2 + 0^2 + 0^2 + {(-1)}^2 + 0^2 \\ 1 &amp;= 0^2 + 0^2 + 0^2 + 0^2 + 1^2 \\ 1 &amp;= 0^2 + 0^2 + 0^2 + 0^2 + {(-1)}^2 \end{align*} $$</p>

<p>으로 총 $10$가지다.</p>

<p>엄밀하게 말해서, &quot;음이 아닌 정수 $n$을 네 제곱수의 합으로 나타내는 경우의 수&quot;와 &quot;음이 아닌 정수 $n$을 다섯 제곱수의 합으로 나타내는 경우의 수&quot;는 각각</p>

<p>$$ r_{4}(n) = \left\vert \{ \left( a_{1}, a_{2}, a_{3}, a_{4} \right) \in \mathbb{Z}^{4} \ : \ n = {a_{1}}^2 + {a_{2}}^2 + {a_{3}}^2 + {a_{4}}^2\} \right\vert $$</p>

<p>$$ r_{5}(n) = \left\vert \{ \left( a_{1}, a_{2}, a_{3}, a_{4}, a_{5} \right) \in \mathbb{Z}^{5} \ : \ n = {a_{1}}^2 + {a_{2}}^2 + {a_{3}}^2 + {a_{4}}^2 + {a_{5}}^2\} \right\vert $$</p>

<p>이다.</p>

<p>이에 흥미를 느낀 상근이는 $n$을 네 제곱수의 합으로 나타내는 경우의 수와 다섯 제곱수의 합으로 나타내는 경우의 수를 표로 정리했다.</p>

<table align="center" border="3" bordercolor="#ccc" cellpadding="5" cellspacing="0" class="table table-bordered" style="background-color:#e6e6fa;border-style:hidden;">
	<tbody>
		<tr>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$n$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$0$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$1$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$2$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$3$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$4$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$5$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$6$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$7$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$8$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$9$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$10$</span></td>
		</tr>
		<tr>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$r_{4}(n)$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$1$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$8$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$24$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$32$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$24$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$48$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$96$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$64$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$24$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$104$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$144$</span></td>
		</tr>
		<tr>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$r_{5}(n)$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$1$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$10$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$40$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$80$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$90$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$112$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$240$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$320$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$200$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$250$</span></td>
			<td style="text-align: center; background-color: rgb(255, 255, 255); border-color: rgb(0, 0, 0);"><span style="background-color:#ffffff;">$560$</span></td>
		</tr>
	</tbody>
</table>

<p>손으로 일일이 계산하다 지쳐버린 상근이를 위해, $n$이 주어지면 $n$을 네 제곱수의 합으로 나타내는 경우의 수와 다섯 제곱수의 합으로 나타내는 경우의 수를 구해주자!</p>

### 입력

<p>첫째 줄에 정수 $n$이 주어진다. ($0 \leq n \leq 10^{10}$)</p>

### 출력

<p>첫째 줄에 $n$을 네 제곱수의 합으로 나타내는 경우의 수를, 둘째 줄에 $n$을 다섯 제곱수의 합으로 나타내는 경우의 수를 출력한다.</p>