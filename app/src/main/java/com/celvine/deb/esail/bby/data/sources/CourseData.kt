package com.celvine.deb.esail.bby.data.sources

import com.celvine.deb.esail.bby.data.model.CaptainModel
import com.celvine.deb.esail.bby.data.model.CourseModel

object CourseData {
    val data = listOf(
        CourseModel(
            id = 1,
            title = "Docker & Kubernetes: The Practical Guide",
            sortDesc = "Learn Docker, Docker Compose, Multi-Container Projects, Deployment and all about Kubernetes from the ground up!",
            desc = "Join this bestselling Docker & Kubernetes course and learn two of the most important development technologies from the ground up, in great detail!\n" +
                    "\n" +
                    "Docker & Kubernetes are amongst the most in-demand technologies and topics you can learn these days.\n" +
                    "\n" +
                    "Why?\n" +
                    "\n" +
                    "Because they significantly simplify the development and deployment process of both simple and complex software projects. Especially in web development (though not limited to that), Docker can really take you to the next level!",
            isFree = false,
            price = "129k",
            banner = "https://celvine.sirv.com/esail/bec1043d5a9ef77e413f3872a23f6958.webp",
            rating = "4.7 (14k)",
            Captain = CaptainModel(
                Name = "Maximilian Schwarzmüller",
                Job = "Online Education",
                Image = "https://img-c.udemycdn.com/user/200_H/31926668_94e7_6.jpg"
            ),
            category = "Development",
            isPopular = true,
            isFlashSale = true
        ),
    )
}