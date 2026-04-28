# [Platinum III] Hangar do SBC - 20283

[문제 링크](https://www.acmicpc.net/problem/20283)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 14, 맞힌 사람: 13, 정답 비율: 72.222%

### 분류

수학, 그리디 알고리즘, 정렬, 조합론

### 문제 설명

<p>Um pequeno avião de carga do Sistema Binário de Cargas (SBC) foi projetado para transportar produtos especiais e secretos. Esses produtos são agrupados em caixas com diversos pesos.</p>

<p>O avião tem uma faixa de peso de segurança, dentro da qual a aeronave fica estável. Mais especificamente, existe um intervalo tal que se o peso total das caixas transportadas ficar fora desse intervalo então não será possível garantir a estabilidade do voo.</p>

<p>Sabe-se que todas as caixas têm pesos distintos. Além disso, dadas duas caixas, a mais pesada pesa pelo menos o dobro da caixa mais leve.</p>

<p>Sua tarefa é determinar de quantas formas se pode escolher um número especificado de caixas para se transportar no avião sem desestabilizá-lo.</p>

### 입력

<p>A primeira linha da entrada contém dois inteiros, N e K, que representam o número de caixas disponíveis e o número de caixas que devem ser embarcadas no avião, respectivamente.</p>

<p>A segunda linha da entrada contém N inteiros, separados por um espaço em branco, que representam os pesos das caixas.</p>

<p>A terceira linha da entrada contém dois inteiros, A e B, que especificam o intervalo de segurança dos pesos, que é o intervalo (fechado) [A, B].</p>

<p>Considere todos os pesos informados na mesma unidade.</p>

### 출력

<p>A saída consiste de uma única linha, que contém o número de diferentes escolhas de caixas na quantidade especificada, sem por em risco o voo.</p>

### 제한

<ul>
	<li>1 &le; N &le; 50.</li>
	<li>1 &le; K &le; 50.</li>
	<li>o peso P de cada caixa está no intervalo 1 &le; P &le; 10<sup>18</sup>.</li>
	<li>1 &le; A &le; B &le; 2 &times; 10<sup>18</sup>.</li>
</ul>