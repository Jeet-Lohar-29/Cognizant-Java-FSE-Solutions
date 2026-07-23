import axios from "axios";
import GitClient from "./GitClient";

jest.mock("axios");

describe("Git Client Tests", () => {

    test("should return repository names for techiesyed", async () => {

        const repos = [

            { name: "RepoOne" },
            { name: "RepoTwo" }

        ];

        axios.get.mockResolvedValue({

            data: repos

        });

        const response = await GitClient.getRepositories("techiesyed");

        expect(axios.get).toHaveBeenCalledTimes(1);

        expect(response.data).toEqual(repos);

    });

});